package com.example.SpringBootValidation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOne {
    @NotNull(message = "customerName is mandatory")
    @NotBlank(message = "customerName is mandatory")
    @NotEmpty(message = "customerName is mandatory")
    @Size(min = 2, max = 50, message = "customerCountry must be between 2 and 50 characters")
    private String customerName;

    @NotNull(message = "customerCountry is mandatory")
    @NotBlank(message = "customerCountry is mandatory")
    @NotEmpty(message = "customerCountry is mandatory")
    @Size(min = 2, max = 50, message = "customerCountry must be between 2 and 50 characters")
    private String customerCountry;

}
