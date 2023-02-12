package com.example.h2.db.H2DBExample.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prd")
public class Product {

    @Id
    private Long productId;
    private String title;

}
