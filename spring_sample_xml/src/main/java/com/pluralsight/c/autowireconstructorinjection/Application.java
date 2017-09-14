package com.pluralsight.c.autowireconstructorinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.b.constructorinjection.service.CustomerService;


/*
 * Constructor Injection
 * -->	Guaranteed contract
 * -->	Constructor defined for each situation
 * -->	Can be used along with setter injection
 * -->	Index based not name based like setter injection
 * */

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContextConstructorInjection.xml");

		CustomerService service = appContext.getBean("customerService",
				CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());
	}

}
