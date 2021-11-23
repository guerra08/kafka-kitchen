package com.example.kafkakitchen.controller;

import com.example.kafkakitchen.kafka.Publisher;
import com.example.kafkakitchen.model.PublishData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publish")
public class PublishController {

    private Publisher publisher;

    public PublishController(Publisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping
    public ResponseEntity<?> getIndex(){
        return ResponseEntity.ok("Hello world");
    }

    @PostMapping("/ingredient")
    public void postPublishIngredient(@RequestBody PublishData postData){
        publisher.sendMessage("New ingredient: " + postData.getName());
    }

}
