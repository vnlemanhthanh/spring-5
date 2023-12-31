package com.vnlemanhthanh.springdemo.dao;

import com.vnlemanhthanh.springdemo.entity.Customer;

import java.util.List;

public interface CustomerDAO {

	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomers(int theId);

    void deleteCustomer(int theId);
}
