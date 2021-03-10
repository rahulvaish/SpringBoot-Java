package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepository extends CrudRepository<Customers, Long> {

	@Query("select custName from Customers")
	List<Customers> getAllCustomersNames();

	@Query("select custName from Customers where country = :countryName ")
	List<Customers> getAllCustomersByCountry(@Param("countryName") String countryName);

	@Query(value="select cust_name from customers_table", nativeQuery = true)
	List<Customers> getAllCustomersNamesNativeWay();
	
	List<Customers> findByCountry(String country);

	@Modifying
	@Transactional
	@Query("UPDATE Customers SET custName = 'Alfred' WHERE country = 'Iran'")
	void updateIranianCustomer();

	@Modifying
	@Transactional
	@Query("DELETE FROM Customers WHERE country = 'Iran'")
	void deleteIranianCustomer();

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO customers_table values (5,'105','Nur','Iran')", nativeQuery = true)
	void insertIranianCustomerNativeWay();

}
