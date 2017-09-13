package com.pluralsight.a.setterinjection.service;

import java.util.List;

import com.pluralsight.a.setterinjection.model.Customer;
import com.pluralsight.a.setterinjection.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	//03. getting rid of the hard coded reference
	//private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository; 

	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	//04. setting customerRepository for setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
