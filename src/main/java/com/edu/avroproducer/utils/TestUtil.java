package com.edu.avroproducer.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.inditex.aqsw.framework.data.test.stream.schema.AvroEncoder;

import org.apache.avro.Schema;
import org.apache.avro.io.Decoder;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.commons.io.FileUtils;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.ResourceUtils;

public final class TestUtil {

  public static <T> T jsonDecodeToAvro(String inputString, Class<T> className,
      Schema schema) {

    T returnObject = null;

    try {
      // JsonDecoder jsonDecoder = DecoderFactory.get().jsonDecoder(schema, readStringFile(inputString));
      // Workaround for bug <a href="https://issues.apache.org/jira/browse/AVRO-2890">java JSON decoder does not respect default values for
      // fields</a>
      Decoder jsonDecoder = new ExtendedJsonDecoder(schema, readStringFile(inputString));
      SpecificDatumReader<T> reader = new SpecificDatumReader<T>(className);
      returnObject = reader.read(null, jsonDecoder);
    } catch (IOException e) {
      throw new RuntimeException("Error creating Avro form JSON file. JSON file: " + inputString, e);
    }

    return returnObject;
  }

  public static String readStringFile(String filePath) {
    try {
      File file = new ClassPathResource(filePath).getFile();
      return FileUtils.readFileToString(file, "UTF-8");
    } catch (IOException ex) {
      throw new RuntimeException("Error reading file '" + filePath + "'", ex);
    }
  }

  public static <T> Message<?> buildAvroMessage(T envelope, Class<T> className, Consumer<Long, String> consumer) throws IOException {
    return AvroEncoder.nonRegisteredAvroMessageBuilder(envelope, className).setHeader(KafkaHeaders.CONSUMER, consumer).build();
  }

  public static <T> Message<?> buildAvroMessage(T envelope, Class<T> className, Consumer<Long, String> consumer,
      Map<String, String> headers) throws IOException {
    MessageBuilder<byte[]> messageBuilder = AvroEncoder.nonRegisteredAvroMessageBuilder(envelope, className);
    headers.forEach((key, value) -> messageBuilder.setHeader(key, value));
    return messageBuilder.setHeader(KafkaHeaders.CONSUMER, consumer).build();
  }

  public static <T> Message<?> buildMalformedMessage(Consumer<Long, String> consumer) throws IOException {
    final Map<String, Object> headers = new HashMap<>();
    headers.put(KafkaHeaders.CONSUMER, consumer);
    return new GenericMessage<>("Malformed message", headers);
  }

  public static Message<?> buildMalformedMessage(Consumer<Long, String> consumer, Map<String, Object> headers) {
    headers.put(KafkaHeaders.CONSUMER, consumer);
    return new GenericMessage<>("Malformed message", headers);
  }

}
