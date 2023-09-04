package com.kafkaDemo.Producers;

import com.kafkaDemo.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class jsonProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(jsonProducer.class);

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
//
//    public jsonProducer(KafkaTemplate<String, User> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }



    public  void  sendUserDetails(User user){
//        Message<User> message= MessageBuilder
//                .withPayload(user).setHeader(KafkaHeaders.TOPIC,"jsonkafka111")
//                .build();
//
//        kafkaTemplate.send(message);
//        log.info(String.format("json Object is produced..!!!%s",user.toString()));
    }

    public  void  sendListen(User user){
        Message<User> message= MessageBuilder
                .withPayload(user).setHeader(KafkaHeaders.TOPIC,"jsonkafka222")
                .build();

        kafkaTemplate.send(message);
//        LOGGER.info();
        log.info(String.format("json Object is produced..!!!%s",user.toString()));
    }
    public  void  sendListen1(User user){
        Message<User> message= MessageBuilder
                .withPayload(user).setHeader(KafkaHeaders.TOPIC,"newone")
                .build();

        kafkaTemplate.send(message);
//        LOGGER.info();
        log.info(String.format("json Object is produced..!!!%s",user.toString()));
    }
}
