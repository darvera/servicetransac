package com.nttdata.servicetransac.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString(exclude = {"idTransac"}) //generate automatic id for client
public class Transaction {
    @Id
    private String idTransac;
    private String amount;
    private LocalDateTime createAt;
    Client client;
    Product product;
}
