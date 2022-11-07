package com.nttdata.bootcamp.DebitCard.domain.entity;

import org.springframework.data.annotation.Id;

public class CreditCard {
    @Id
    private String id;
    private String customerId;
}
