package com.pluralsight.d.autowirebytype.repository;

import java.util.List;

import com.pluralsight.d.autowirebytype.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}