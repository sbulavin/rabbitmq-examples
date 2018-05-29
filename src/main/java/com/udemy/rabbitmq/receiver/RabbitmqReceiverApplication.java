package com.udemy.rabbitmq.receiver;

import com.udemy.rabbitmq.sender.RabbitmqdemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqdemoApplication.class, args);
    }
}
