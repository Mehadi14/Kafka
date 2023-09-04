package com.kafkaDemo.Consumer;

import com.kafkaDemo.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class jsonConsumer2 {

    @KafkaListener(topics = "jsonkafka222",groupId = "grp_mmm")
    public void subscriber2(User user){
        log.info("consumer 2 consuming json objectt --->%s",user.toString());
        System.out.println(user);
    }

    @KafkaListener(groupId = "grp_mmm",topicPartitions = @TopicPartition(topic = "newone",partitionOffsets = {
            @PartitionOffset(partition = "0",initialOffset = "0")
    }))
    public void  listenToPartitionWithOffset(
        @Payload User user,
        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
        @Header(KafkaHeaders.OFFSET) int offset) {
            log.info("Received message [{}] from partition-{} with offset-{}",
                    user,
                    partition,
                    offset);
    }
}
