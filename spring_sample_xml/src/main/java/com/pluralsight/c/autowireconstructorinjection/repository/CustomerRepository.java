package com.pluralsight.c.autowireconstructorinjection.repository;

import java.util.List;

import com.pluralsight.b.constructorinjection.model.Customer;


public interface CustomerRepository {

	public abstract List<Customer> findAll();

}