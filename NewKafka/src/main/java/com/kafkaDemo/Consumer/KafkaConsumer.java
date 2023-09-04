package com.kafkaDemo.Consumer;

import com.kafkaDemo.Utils.AppContants;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class KafkaConsumer {

    private  static  final Logger LOGGER= (Logger) LoggerFactory.getLogger(KafkaConsumer.class);



    @KafkaListener(topics = AppContants.TOPIC_NAME,groupId = AppContants.GROUP_Id)
    public  void  consume(String message){

        LOGGER.info(String.format("Message recieved --> %s",message));

    }

}
