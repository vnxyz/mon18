package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

//07. Defining it as a service bean
/*08. 
 * 
 * Now we have all of our code annotated and discovered as beans. 
 * Now, we can go into applicationContext and start wiring them up. 
 * But lets use autowiring to configure these.
 * 
 * */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	/**
	 * 10. Member variables
	 * 
	 * To autowire at a member variable level we need to place an annotation at
	 * our member level. Using the component scanner, spring will look for any
	 * code marked with the stereotype annotations and the autowired annotations
	 * to wire up your application appropriately.
	 * 
	 * We can do this by eliminating the hard coding at the end and placing
	 * autowired annotation.
	 * 
	 * Now our application is wired up using the customer repository from
	 * hibernate customer repository.
	 */
	// private CustomerRepository customerRepository = new
	// HibernateCustomerRepositoryImpl();
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
