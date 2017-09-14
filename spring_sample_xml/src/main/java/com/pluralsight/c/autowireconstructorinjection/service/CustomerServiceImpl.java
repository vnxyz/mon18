package com.pluralsight.c.autowireconstructorinjection.service;

import java.util.List;

import com.pluralsight.b.constructorinjection.model.Customer;
import com.pluralsight.b.constructorinjection.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	// 02. Creating constructors
	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	// 04. setting customerRepository for setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
