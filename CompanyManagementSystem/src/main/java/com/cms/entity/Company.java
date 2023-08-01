package com.cms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor


public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String pincode;
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Employee_id")
	private List<Employee> employeeList;
	@Builder
	public Company(int id, String name, String address, String pincode, List<Employee> employeeList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.employeeList = employeeList;
	}*/
	
	}
