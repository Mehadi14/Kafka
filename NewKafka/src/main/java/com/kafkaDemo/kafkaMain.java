package com.kafkaDemo;

import com.kafkaDemo.Model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class kafkaMain {
    public static void main(String[] args) {

        SpringApplication.run(kafkaMain.class);
        System.out.println("Hello world!");

//      User user=  new User();
//      user.setId(1);
//      user.setFirstName("medi");
//        User user1=  new User();
//        BeanUtils.copyProperties(user,user1);
//        System.out.println(user1.toString());

    }
}