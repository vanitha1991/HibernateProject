package com.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("setterinjectionbean.xml");
		Employee e=(Employee) context.getBean("bean1");
		e.display();
		
		Employee e1=(Employee) context.getBean("bean2");
		e1.display();

	}

}
