package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class Consumer {

  public static void main(String[] args) {
    SpringApplication.run(Consumer.class, args);
  }

  @KafkaListener(id = "listen1", topics = "Compras")
  public void listen1(String in) throws InterruptedException {
    System.out.println("Se ha leido el mensaje: ".concat(in));
    Thread.sleep(2000);
  }
}