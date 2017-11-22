package com.pluralsight.b.setter.repository;

import java.util.List;



public interface CustomerRepository {

	public abstract List<Customer> findAll();

}