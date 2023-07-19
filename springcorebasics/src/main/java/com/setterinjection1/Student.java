package com.setterinjection1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private College college;
	private List<String> phoneNumber;
	private Set<Double> marks;
	private Map<String,String> course;
	
	
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public void setMarks(Set<Double> marks) {
		this.marks = marks;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCollege(College college) {
		this.college = college;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(college.name+" "+college.department);
		System.out.println(phoneNumber);
		System.out.println(marks);
		System.out.println(course);
	}

}
