package com.edu.avroproducer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.messaging.MessageChannel;

/**
 * Enables PIPE binding and set up AMIGA Stream channels to be used as required.
 */
@EnableBinding(PipeStreamChannels.class)
@Configuration
public class AmigaStreamConfiguration {

  @Bean
  @Primary
  public MessageChannel watcher(final PipeStreamChannels pipeStreamChannels) {
    return pipeStreamChannels.productKafkaOutput();
  }

  @Bean
  @Primary
  public MessageChannel command(final PipeStreamChannels pipeStreamChannels) {
    return pipeStreamChannels.commandKafkaOutput();
  }

  @Bean
  @Primary
  public MessageChannel subscriptions(final PipeStreamChannels pipeStreamChannels) {
    return pipeStreamChannels.subscriptionsKafkaOutput();
  }
}
