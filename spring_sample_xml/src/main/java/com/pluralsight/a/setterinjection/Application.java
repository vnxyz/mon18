package com.pluralsight.a.setterinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.a.setterinjection.service.CustomerService;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 06. here implementation is hard coded so we are commenting it and
		 */
		// CustomerService service = new CustomerServiceImpl();

		/*
		 * 07. Before referring to bean we need to import applicationContext.xml
		 * in src/main/resources. applicationContext.xml will be copied at the
		 * root of the directory structure
		 */
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContextSetterInjection.xml");
		/*
		 * 08. Getting reference to the bean customerService in
		 * applicationContext.xml In this look up method getBean we can pass
		 * bean name and class type so that we don't have to cast or suppress
		 * warnings. So we are telling that it is looking CustomerService.class(Interface)
		 */
		CustomerService service = appContext.getBean("customerService",
				CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());
	}

}
