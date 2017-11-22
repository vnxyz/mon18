package com.pluralsight.a.memberannotations.repository;

import java.util.List;

import com.pluralsight.a.memberannotations.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}