package com.pluralsight.b.setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.b.setter.service.CustomerService;



public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerService service = appContext.getBean("customerService",
				CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
