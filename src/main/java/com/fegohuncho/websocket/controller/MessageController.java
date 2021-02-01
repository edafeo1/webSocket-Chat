package com.fegohuncho.websocket.controller;

import com.fegohuncho.websocket.model.MessageModel;
import com.fegohuncho.websocket.storage.UserStorage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    //change {to} - Username
    @MessageMapping("/chat/{to}")
    public void sendMessage(@DestinationVariable String to, MessageModel message ){
         System.out.println("sending message "+ message + " to " + to );
         boolean isExist = UserStorage.getInstance().getUsers().contains(to);

    }
}
