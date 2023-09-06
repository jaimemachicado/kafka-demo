package com.kafka;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Producer {

  public static void main(String[] args) {
    SpringApplication.run(Producer.class, args);
  }

//  @Bean
//  public NewTopic topic() {
//    return TopicBuilder.name("Compras").partitions(10).replicas(1).build();
//  }

  @Bean
  public ApplicationRunner runner(KafkaTemplate<String, String> template) {
    return args -> {
      for (int i = 0; i < 50; i++) {
        template.send("Compras", "iPhone 15 - message ".concat(String.valueOf(i)));
      }
    };
  }
}