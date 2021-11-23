package com.example.kafkakitchen.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "ingredients", groupId = "kitchen")
    public void listenGroupKitchen(String message) {
        System.out.println("Received Message in group kitchen: " + message);
    }

}
