package com.pluralsight.b.constructorinjection.service;

import java.util.List;

import com.pluralsight.b.constructorinjection.model.Customer;
public interface CustomerService {

	public abstract List<Customer> findAll();

}