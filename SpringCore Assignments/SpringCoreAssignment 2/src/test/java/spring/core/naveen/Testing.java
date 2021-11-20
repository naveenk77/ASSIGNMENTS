package spring.core.naveen;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class Testing {

	@Test
	public void test() {
		ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
		Question q= (Question) con.getBean("question");
		Question ques= new Question(101, "What are your names?", Arrays.asList("Naveen", "Shivaji", "Subash"));
		assertEquals(q,ques);
	}

}
