package alex.klimchuk.reactive.stock.quote.service.configs;

import com.rabbitmq.client.Connection;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;
import reactor.rabbitmq.*;

import javax.annotation.PreDestroy;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Configuration
public class RabbitConfig {

    public static final String QUEUE = "quotes";

    @Autowired
    public Mono<Connection> connectionMono;

    @Bean
    public Mono<Connection> connectionMono(CachingConnectionFactory connectionFactory){
        return Mono.fromCallable(connectionFactory.getRabbitConnectionFactory()::newConnection);
    }

    @Bean
    public Sender sender(Mono<Connection> mono) {
        return RabbitFlux.createSender(new SenderOptions().connectionMono(mono));
    }

    @Bean
    public Receiver receiver(Mono<Connection> mono) {
        return RabbitFlux.createReceiver(new ReceiverOptions().connectionMono(mono));
    }

    @PreDestroy
    public void close() throws Exception {
        connectionMono.block().close();
    }

}
