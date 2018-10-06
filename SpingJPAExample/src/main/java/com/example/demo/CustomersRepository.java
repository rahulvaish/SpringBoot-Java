package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository  extends CrudRepository<Customers, Long>{

	Customers findById(String id);
	List<Customers> findByCountry(String country);
	
//	@Query("SELECT c.Country FROM Customers c")
//	List<Customers> getAllCountries();
	
    List<Customers> findByCustName(String custName);
}
