package assignmentQuestion1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("question1.xml");
		Customer customer = (Customer) context.getBean("customer");
		customer.details();

	}

}
