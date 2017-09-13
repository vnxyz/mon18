package com.pluralsight.a.setterinjection.repository;

import java.util.List;

import com.pluralsight.a.setterinjection.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}