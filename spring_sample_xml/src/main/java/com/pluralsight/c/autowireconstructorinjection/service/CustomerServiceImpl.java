package com.pluralsight.c.autowireconstructorinjection.service;

import java.util.List;

import com.pluralsight.c.autowireconstructorinjection.model.Customer;
import com.pluralsight.c.autowireconstructorinjection.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
