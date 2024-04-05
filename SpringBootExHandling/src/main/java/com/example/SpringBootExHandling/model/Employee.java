package com.example.SpringBootExHandling.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String empId;
	private String name;
	private String designation;
	private double salary;
}
