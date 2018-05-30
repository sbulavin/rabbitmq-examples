package com.udemy.rabbitmq.receiver;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {

    @Bean
    Exchange exampleExchange(){
        return new TopicExchange("exampleExchange");
    }

    @Bean
    Exchange exampleeExchangeViaBuilder(){
        return ExchangeBuilder.directExchange("directExchange")
                .autoDelete()
                .internal()
                .build();
    }

    @Bean
    Exchange newExchange(){
        return ExchangeBuilder.topicExchange("topicTestExchange")
                .autoDelete()
                .durable(true)
                .internal()
                .build();
    }
}
