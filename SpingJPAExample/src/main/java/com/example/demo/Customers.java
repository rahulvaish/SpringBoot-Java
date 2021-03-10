package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers_table")
public class Customers {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "cust_number", length = 20)
	private String custNo;

	@Column(name = "cust_name", length = 20)
	private String custName;

	@Column(name = "country", length = 20)
	private String country;

	public Customers() {
	}
	
	public Customers(Long id, String custNo, String custName, String country) {
		super();
		this.id = id;
		this.custNo = custNo;
		this.custName = custName;
		this.country = country;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custNo=" + custNo + ", custName=" + custName + ", country=" + country + "]";
	}

	
}
