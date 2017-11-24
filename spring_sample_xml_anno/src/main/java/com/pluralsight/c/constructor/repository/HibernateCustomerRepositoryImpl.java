package com.pluralsight.c.constructor.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.c.constructor.model.Customer;



@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Venkata Neha");
		customer.setLastName("Koralla");
		
		customers.add(customer);
		
		return customers;
		
	}
}
