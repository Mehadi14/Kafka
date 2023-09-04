package com.kafkaDemo.Consumer;

import com.kafkaDemo.Model.User;
import com.kafkaDemo.Producers.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class jsonConsumer {

//    private  static  final Logger logger= (Logger) LoggerFactory.getLogger(jsonConsumer.class);

  @KafkaListener(topics = "jsonkafka222",groupId = "grp_mmm")
  public void jsonConsume(User user){
     log.info(" consumer 1  json user is recived by consumer 1 --->%s",user.toString());
     System.out.println(user);
  }
}
