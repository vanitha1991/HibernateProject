package com.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Tiger implements Animal
{
	public void eat()
	{
		System.out.println("Tiger is eating");
	}
}

class Lion implements Animal
{
	public void eat()
	{

	System.out.println("Lion is eating");
	}
}
public class AnimalMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Tiger t=(Tiger) context.getBean("tigerBean");
		t.eat();
		Lion l=(Lion) context.getBean("lionBean");
		l.eat();
		
		
	}
}
