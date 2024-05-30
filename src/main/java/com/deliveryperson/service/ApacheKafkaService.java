package com.deliveryperson.service;

import com.deliveryperson.config.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApacheKafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public Boolean updateLocation(String location){
        this.kafkaTemplate.send(Constants.LOCATION_TOPIC_NAME,location);
        return true;
    }
}
