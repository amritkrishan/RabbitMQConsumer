package com.consumer.rabbitmqconsumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.consumer.rabbitmqconsumer.model.Employee;

@Component
@RabbitListener(queues = "${consumer.rabbitmq.queue}")
public class RabbitMQConsumer {

    @RabbitHandler
    public void receivedMessage(Employee employee) {
        System.out.println("Received Message From RabbitMQ: " + employee);
    }
}