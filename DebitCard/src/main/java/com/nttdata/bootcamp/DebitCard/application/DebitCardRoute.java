package com.nttdata.bootcamp.DebitCard.application;

import com.nttdata.bootcamp.DebitCard.application.handler.CreditCardHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import org.springframework.http.MediaType;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class DebitCardRoute {
    @Bean
    public RouterFunction<ServerResponse> creditCardRouterFunc(CreditCardHandler creditCardHandler){
        return RouterFunctions
                // Get - Retorna las tarjetas de debito
                .route(GET("/api/v1/creditcard").and(accept(MediaType.valueOf(MediaType.TEXT_EVENT_STREAM_VALUE))), creditCardHandler::getAll)
                // GetById - Retorna una tarjeta de debito
                .andRoute(GET("/api/v1/creditcard/{id}").and(accept(MediaType.APPLICATION_JSON)), creditCardHandler::getById)
                // Save - Crea una tarjeta de debito
                .andRoute(POST("/api/v1/creditcard").and(accept(MediaType.APPLICATION_JSON)), creditCardHandler::save)
                // Update - Actualiza una tarjeta de debito
                .andRoute(PUT("/api/v1/creditcard/update/{id}").and(accept(MediaType.APPLICATION_JSON)), creditCardHandler::update)
                // Delete - Elimina una tarjeta de debito
                .andRoute(DELETE("/api/v1/creditcard/delete/{id}").and(accept(MediaType.APPLICATION_JSON)), creditCardHandler::delete);
                // Agrega una cuenta a una tarjeta de debito
                //
    }
}
