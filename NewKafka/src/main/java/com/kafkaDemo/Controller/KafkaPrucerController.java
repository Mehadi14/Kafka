package com.kafkaDemo.Controller;

import com.kafkaDemo.Producers.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaPrucerController {


    @Autowired
    private KafkaProducer kafkaProducer;

    public  KafkaPrucerController(KafkaProducer kafkaProducer1)
    {
        this.kafkaProducer=kafkaProducer1;
    }


    @GetMapping("/publish")
    public ResponseEntity<String>  publish(@RequestParam("message") String message){

        kafkaProducer.sendMessage(message);

        return ResponseEntity.ok("message sent to kafka topic ");

    }

}
