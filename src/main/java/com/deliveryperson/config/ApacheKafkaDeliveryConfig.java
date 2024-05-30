package com.deliveryperson.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ApacheKafkaDeliveryConfig {
    @Bean
    public NewTopic topic(){
        // ca
        return TopicBuilder
                .name(Constants.LOCATION_TOPIC_NAME)
                .build();
    }
}
