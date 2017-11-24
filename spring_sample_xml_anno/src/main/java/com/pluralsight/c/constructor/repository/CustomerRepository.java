package com.pluralsight.c.constructor.repository;

import java.util.List;

import com.pluralsight.c.constructor.model.Customer;




public interface CustomerRepository {

	public abstract List<Customer> findAll();

}