package com.pluralsight.b.setter.repository;

import java.util.List;

import com.pluralsight.b.setter.model.Customer;


public interface CustomerRepository {

	public abstract List<Customer> findAll();

}