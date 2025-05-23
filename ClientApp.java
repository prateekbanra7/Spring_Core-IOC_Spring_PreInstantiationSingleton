package in.abc.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.abc.bean.Flipkart;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("IOC container created...");
		
		Flipkart flipkart = context.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart.Shopping(new String[] {"fossil","cryzal"}, new float[] {3000.0f,3000.0f} ));
		
	}
}
