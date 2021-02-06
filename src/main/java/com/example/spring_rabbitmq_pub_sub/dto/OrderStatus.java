package com.example.spring_rabbitmq_pub_sub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {

    private Order order;
    private String status;//progress,completed
    private String message;
}