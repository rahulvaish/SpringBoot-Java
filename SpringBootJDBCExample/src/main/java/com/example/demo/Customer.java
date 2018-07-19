package com.example.demo;

public class Customer {
	 
    private String custNo;
    private String custName;
    private String country;
 
    public Customer() {
    }
 
    public Customer(String custNumber, String custName, String country) {
        this.custNo = custNumber;
        this.custName = custName;
        this.country = country;
    }
 
    public String getCustNo() {
       return custNo;
    }
 
    public void setCustNo(String custNo) {
       this.custNo = custNo;
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
}