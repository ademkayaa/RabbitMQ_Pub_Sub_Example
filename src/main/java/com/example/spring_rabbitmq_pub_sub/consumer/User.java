package com.example.spring_rabbitmq_pub_sub.consumer;

import com.example.spring_rabbitmq_pub_sub.config.MessagingConfig;
import com.example.spring_rabbitmq_pub_sub.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}