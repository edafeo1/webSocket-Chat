package com.fegohuncho.websocket.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry){
        stompEndpointRegistry.addEndpoint("/chat").setAllowedOriginPatterns("*").withSockJS();
    }

    @Override
    public  void configureMessageBroker(MessageBrokerRegistry messageBrokerRegistry){
        messageBrokerRegistry.setApplicationDestinationPrefixes("/app").enableSimpleBroker("/topic");
    }
}