package com.pluralsight.c.autowireconstructorinjection.service;

import java.util.List;

import com.pluralsight.c.autowireconstructorinjection.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}