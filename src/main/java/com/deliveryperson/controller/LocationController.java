package com.deliveryperson.controller;

import com.deliveryperson.service.ApacheKafkaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    public final ApacheKafkaService apacheKafkaService;

    public LocationController(ApacheKafkaService apacheKafkaService) {
        this.apacheKafkaService = apacheKafkaService;
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        apacheKafkaService.updateLocation("(" + Math.round(Math.random() * 100) + "," + Math.round(Math.random() * 100) + ")");
        return new ResponseEntity<>(Map.of("Message","Location Updated Successfully"), HttpStatus.OK);
    }
}
