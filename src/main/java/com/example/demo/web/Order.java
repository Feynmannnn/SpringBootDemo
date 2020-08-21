package com.example.demo.web;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Order {
    @NotNull
    private String street;
}
