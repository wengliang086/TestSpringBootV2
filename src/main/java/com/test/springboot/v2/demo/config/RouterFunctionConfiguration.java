package com.test.springboot.v2.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Configuration
public class RouterFunctionConfiguration {

    private Collection<User> getAll() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new User("id" + i, "name" + i));
        }
        return list;
    }

    @Bean
    public RouterFunction<ServerResponse> personFindAll() {
        return RouterFunctions.route(RequestPredicates.GET("/find/all"), serverRequest -> {
            Flux<User> userFlux = Flux.fromIterable(getAll());
            return ServerResponse.ok().body(userFlux, User.class);
        });
    }
}
