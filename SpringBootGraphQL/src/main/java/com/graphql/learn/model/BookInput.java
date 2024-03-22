package com.graphql.learn.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookInput {
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
