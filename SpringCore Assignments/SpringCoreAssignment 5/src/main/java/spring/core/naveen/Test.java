package spring.core.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
		Customer cus= (Customer) con.getBean("customer");
		System.out.println(cus);
	}

}
