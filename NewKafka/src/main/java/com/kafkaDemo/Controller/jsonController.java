package com.kafkaDemo.Controller;

import com.kafkaDemo.Model.User;
import com.kafkaDemo.Producers.jsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3/kafka")
public class jsonController {
    @Autowired
    private com.kafkaDemo.Producers.jsonProducer jsonProducer;

    @PostMapping("/jsonpublish")
    public ResponseEntity<String> jsonpublish(@RequestBody User user){
         jsonProducer.sendUserDetails(user);
         jsonProducer.sendListen(user);
         return ResponseEntity.ok("Json send to Kafka Topic ");

    }
}
