package com.pluralsight.b.setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.b.setter.service.CustomerService;

/**
 * 01. Setter Injection
 * 
 * Now that we have a bean defined. How do we go about using it? Using
 * injection, that is how. There are two types of injection. Setter injection
 * and constructor injection. Setter injection is using exactly what it sounds
 * like. The getters and setters of our bean. And constructor injection uses the
 * defined constructors. Something to keep in mind though is that you can use
 * both setter and constructor injection together. We're going to start with an
 * example using setter injection and I also feel that it's better for existing
 * code.
 * So lets go CustomerServiceImpl
 */


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
