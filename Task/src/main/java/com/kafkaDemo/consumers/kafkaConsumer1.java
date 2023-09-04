package com.kafkaDemo.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer1 {
//  @KafkaListener(topics = "test-topic",groupId = "task-group-test")
    @KafkaListener(topics = "test-topic")
    public void consumeMessage(String message) {
        System.out.println("Consumer 1 - Received message: " + message);
    }
}
