package com.pluralsight.c.constructor.service;

import java.util.List;

import com.pluralsight.c.constructor.model.Customer;



public interface CustomerService {

	public abstract List<Customer> findAll();

}