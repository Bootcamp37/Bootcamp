package com.nttdata.bootcamp.DebitCard.application.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CreditCardHandler {
    static Mono<ServerResponse> notFund = ServerResponse.notFound().build();
    public <T extends ServerResponse> Mono<T> getAll(ServerRequest serverRequest) {
    }

    public Mono<ServerResponse> getById(ServerRequest serverRequest) {
    }

    public Mono<ServerResponse> save(ServerRequest serverRequest) {
    }

    public Mono<ServerResponse> update(ServerRequest serverRequest) {
    }

    public Mono<ServerResponse> delete(ServerRequest serverRequest) {
    }
}
