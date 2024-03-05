package com.example.moviepagination.entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
@Validated
public class Movie {

    @Id
    private Long movieId;
    @NotNull
    private String title;
    @Min(value = 0L, message = "rating.negative : please pass a non-negative value")
    private Double rating;
}