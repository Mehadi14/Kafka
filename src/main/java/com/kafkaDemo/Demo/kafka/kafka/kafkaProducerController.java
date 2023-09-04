package com.kafkaDemo.Demo.kafka.kafka;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data

public class kafkaProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;

@GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam String message)
    {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("message senttt to kafka topic");
    }
}
