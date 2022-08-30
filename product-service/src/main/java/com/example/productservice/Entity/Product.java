package com.example.productservice.Entity;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Product {
    @Id
    @GeneratedValue
    private BigInteger id;

}
