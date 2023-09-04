package com.kafkaDemo.Consumer;
import com.kafkaDemo.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
//@KafkaListener(id = "CLass_Level_Listner",topics = "newone",groupId = "grp_200")
@Slf4j
public class levelClass {

//    @KafkaHandler
//    public void mylisten(User user) {
//        log.info("KafkaHandler[User] {}\", user");
//    }
}

