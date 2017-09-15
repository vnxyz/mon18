import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * 01. Just like in the XML configuration module, we need a place to bootstrap
 * the annotation scanner. We do that in applicationContext.xml. The difference
 * is we just have an annotation scanner in there and that goes out and looks
 * for specified items. So we will configuration to bootstrap and our annotation
 * scanner which uses same conventions as the XML configuration.
 * 
 * */
/***
 * 
 * 05. Stereotype Annotations There are main 3 types of annotations for core
 * Spring that help us to find components or beans inside our application. These
 * are stereotype annotations.
 * 
 * They are:
 * 
 * @Comoponent
 * @Service
 * @Repository
 * 
 *Semantically all are the same. Service and Repository both extend
 *Component. But both really don't add any features or functionaliy
 * 
 */

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstName());
	}

}
