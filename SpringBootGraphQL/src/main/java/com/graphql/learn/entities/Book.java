package com.graphql.learn.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "project_books")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;


}
