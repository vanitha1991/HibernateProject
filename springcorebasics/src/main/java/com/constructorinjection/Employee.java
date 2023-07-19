package com.constructorinjection;

public class Employee {
private int id;
private String name;
 Company company;

public Employee(int id, String name, Company company) {
	super();
	this.id = id;
	this.name = name;
	this.company = company;
}

public Employee(int id) {
	super();
	this.id = id;
}

void display()
{
	System.out.println(id+" "+name);
	System.out.println(company.name+" "+company.address);
}


}
