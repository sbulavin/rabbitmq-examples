package com.udemy.rabbitmq.receiver;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfiguration {

    @Bean
    Queue exampleQueue(){
        return new Queue("exampleQueue", false);
    }

    @Bean
    Queue exampleQueueViaBuilder(){
        return QueueBuilder.durable("exampleQueueViaBuilder")
                .autoDelete()
                .exclusive()
                .build();
    }
}
