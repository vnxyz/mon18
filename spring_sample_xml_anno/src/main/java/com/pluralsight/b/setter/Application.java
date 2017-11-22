package com.pluralsight.b.setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.b.setter.service.CustomerService;

/**
 * 01. Just like in the XML configuration module, we need a place to bootstrap
 * the annotation scanner. We do that in applicationContext.xml. The difference
 * is we just have an annotation scanner in there and that goes out and looks
 * for specified items. So we will configuration to bootstrap and our annotation
 * scanner which uses same conventions as the XML configuration.
 * 
 * 05. Stereotype Annotations There are main 3 types of annotations for core
 * Spring that help us to find components or beans inside our application. These
 * are stereotype annotations.
 * 
 * They are: @Comoponent, @Service, @Repository
 * 
 * Semantically all are the same.
 * 
 * Service and Repository both extend Component. But both really don't add any
 * features or functionality. Its just how you think of them and how you use
 * them.
 * 
 * @Component --> any POJO
 * @Service --> business logic layer (Not WebService)
 * @Repository --> Data layer (Spring JDBC Template, Hibernate, JPA, iBatis)
 */
/**
 * Let's annotate our classes HibernateCustomerRepositoryImpl and CustomerServiceImpl respectively
 * */
/**
 * 
 * 09. Much people feel that Autowire with annotations is straightforward and
 * better. Autowiring a method is hidden because it's tied to where you place
 * that annotation at. Where as XML has wiring step to step.
 * 
 * We can autowire in three places.
 * <ul>
 * <li>Member Variables</li>
 * <li>Constructor</li>
 * <li>Setter</li>
 * </ul>
 * 
 * 
 * */

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 11.
		// CustomerService service = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerService service = appContext.getBean("customerService",
				CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
