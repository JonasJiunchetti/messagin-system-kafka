package com.jonasjiunchetti.messagingsystem.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {
    
    @KafkaListener(topics = "hello-topic", groupId = "group_1")
    public void receiveMessage(String message){
        System.out.println("Consumer message: " + message);
    }

}
