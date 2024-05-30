package com.productconsumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ApacheKafkaConsumerConfig {
    @KafkaListener(topics = Constants.LOCATION_TOPIC_NAME,groupId =Constants.GROUP_ID)
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
