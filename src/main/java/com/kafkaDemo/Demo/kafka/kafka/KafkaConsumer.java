package com.kafkaDemo.Demo.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

//@KafkaListener(topics = "mehadi",groupId = "group-id")
//    public void consume(String message)
//{
//    LOGGER.info(String.format("message receieved->%s",message));
//}


    @KafkaListener(topics = "jsonkafka1",groupId = "group-id")
    public void consumerr(User user)
    {
        LOGGER.info(String.format("message receieved->%s",user));
    }



}

