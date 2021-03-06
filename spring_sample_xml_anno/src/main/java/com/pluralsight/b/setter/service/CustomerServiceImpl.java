package com.pluralsight.b.setter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.b.setter.model.Customer;
import com.pluralsight.b.setter.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	/**
	 * 02. Got rid of the member level autowire and generate a setter and simply
	 * annotate it
	 */
	// @Autowired
	private CustomerRepository customerRepository;

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
