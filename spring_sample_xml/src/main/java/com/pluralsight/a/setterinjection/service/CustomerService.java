package com.pluralsight.a.setterinjection.service;

import java.util.List;

import com.pluralsight.a.setterinjection.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}