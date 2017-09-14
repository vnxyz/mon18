package com.pluralsight.d.autowirebytype.service;

import java.util.List;

import com.pluralsight.d.autowirebytype.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}