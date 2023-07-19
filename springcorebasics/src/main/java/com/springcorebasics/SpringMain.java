package com.springcorebasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		//AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		MyfirstSpringApp obj=(MyfirstSpringApp) context.getBean("bean1");
		System.out.println(obj.getMessage());
		
		MyfirstSpringApp obj1=(MyfirstSpringApp) context.getBean("bean2");
		System.out.println(obj1.getMessage());
		//context.registerShutdownHook();  to invoke destroy method

	}

}
