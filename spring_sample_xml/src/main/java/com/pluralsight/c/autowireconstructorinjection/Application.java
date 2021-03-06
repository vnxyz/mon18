package com.pluralsight.c.autowireconstructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.c.autowireconstructorinjection.service.CustomerService;

/***
 * 
 * @author vnxyz
 * 
 *         Earlier Spring had a bad reputation for having lot of XML reputation,
 *         to counter this Autowiring is introduced which autowires beans
 *         together. There are 4 types of autowiring in Spring 
 *         --> 	byType 
 *        			If I have 2 beans of same class but with different names I will get an
 *         			exception because it doesn't know which bean to choose. 
 *         --> byName
 * 					It fixes the problem of byType.
 * 			
 * 			These both are good because byType allows us to create only one 
 * 			instance of a class in our container. 
 * 			Where as byName will allow us to have multiples and choose the specific object 
 * 			based on the given name.
 * 			-->	constructor
 * 					As seen in before example constructor autowiring is similar to 
 * 					setter injection.
 * 					--> Guaranteed constructor
 * 					--> Constructor defined for each situation
 * 					--> Use together with setter injection
 * 					--> It is index based 
 * 			--> no
 * 					It means we cannot autowire. 
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContextAutowireConstructorInjection.xml");

		CustomerService service = appContext.getBean("customerService",
				CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());
	}

}
