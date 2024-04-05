package com.example.SpringBootValidation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {
    private List<String> list;
    private List<String> errorMessages;
}
