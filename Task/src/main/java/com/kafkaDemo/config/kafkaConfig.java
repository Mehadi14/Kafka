package com.kafkaDemo.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class kafkaConfig {
    private final String bootstrapServers = "${spring.kafka.bootstrap-servers}";
    private final String groupId = "${spring.kafka.consumer.group-id}";

    @Value("${spring.kafka.listener.concurrency}")
    private String concurrency;


    public ConcurrentKafkaListenerContainerFactory<String,String> kafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String,String> factory=new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerfcatory());
        factory.setConcurrency(Integer.valueOf(concurrency));

        return factory;
    }

    private ConsumerFactory consumerfcatory() {

        Map<String,Object> propes=new HashMap<>();

        propes.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        propes.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        propes.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, ErrorHandlingDeserializer.class);
        propes.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class.getName());
        propes.put(JsonDeserializer.VALUE_DEFAULT_TYPE, String.class.getName());
        propes.put(JsonDeserializer.TRUSTED_PACKAGES, "*");


        return new DefaultKafkaConsumerFactory(propes);

    }

}
