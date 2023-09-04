package com.kafkaDemo.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer2 {

    @KafkaListener(topics = "test-topic")
    public void consumeMessage(String message) {
        System.out.println("Consumer 2 - Received message: " + message);
    }
}
