package com.pluralsight.a.memberannotations.service;

import java.util.List;

import com.pluralsight.a.memberannotations.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}