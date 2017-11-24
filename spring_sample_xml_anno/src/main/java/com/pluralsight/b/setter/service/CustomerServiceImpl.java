package com.pluralsight.b.setter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.b.setter.model.Customer;
import com.pluralsight.b.setter.repository.CustomerRepository;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	// private CustomerRepository customerRepository = new
	// HibernateCustomerRepositoryImpl();
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
