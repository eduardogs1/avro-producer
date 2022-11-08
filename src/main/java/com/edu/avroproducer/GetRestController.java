package com.edu.avroproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRestController {

  @Autowired
  private MessageProducer messageProducer;

  @GetMapping(value = "/product")
  public String product() {
    messageProducer.sendWatcher();
    return "watcher enviado";
  }

  @GetMapping(value = "/command")
  public String command() {
    messageProducer.sendCommand();
    return "mensaje del command enviado";
  }

  @GetMapping(value = "/subscription")
  public String subscription() {
    messageProducer.sendSubscription();
    return "mensaje de suscripciones enviado";
  }

  @GetMapping(value = "/prices")
  public String prices() {
    messageProducer.sendPrices();
    return "mensaje de precios enviado";
  }

}
