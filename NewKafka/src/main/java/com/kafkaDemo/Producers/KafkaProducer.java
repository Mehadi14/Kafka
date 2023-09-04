package com.kafkaDemo.Producers;

import com.kafkaDemo.Utils.AppContants;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
@Slf4j
public class KafkaProducer {

    private  static  final Logger logger= (Logger) LoggerFactory.getLogger(KafkaProducer.class);


    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public void sendMessage(String  message){

        logger.info(String.format("Message  sent--->%s ",message));

        kafkaTemplate.send(AppContants.TOPIC_NAME,message);
    }

}
