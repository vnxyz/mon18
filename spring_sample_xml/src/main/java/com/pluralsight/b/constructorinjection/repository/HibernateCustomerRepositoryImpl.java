package com.pluralsight.b.constructorinjection.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.b.constructorinjection.model.Customer;



public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Venkata Neha");
		customer.setLastName("Koralla");
		
		customers.add(customer);
		
		return customers;
		
	}
}
