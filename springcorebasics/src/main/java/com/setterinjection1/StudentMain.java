package com.setterinjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("setterinjectionbean.xml");
		Student s=(Student) context.getBean("student1");
		s.display();
	}

}
