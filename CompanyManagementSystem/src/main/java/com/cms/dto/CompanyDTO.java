package com.cms.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//import com.cms.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Builder
@NoArgsConstructor
public class CompanyDTO {
	private int id;
	
	@NotNull(message="Name of Employee can never be null")
	@NotBlank(message="Name of Employee can never be empty")
	@Size(min=5,max=30)
	private String name;
	
	@NotBlank(message="Name of Employee can never be empty")
	private String address;
	
	@Pattern(regexp="\\d{6}")
	private String pincode;
	
	//private List<Employee> employeeList;
	
	/*@Builder
	public CompanyDTO(int id,
			@NotNull(message = "Name of Employee can never be null") @NotBlank(message = "Name of Employee can never be empty") @Size(min = 10, max = 30) String name,
			@NotBlank(message = "Name of Employee can never be empty") String address,
			@Pattern(regexp = "\\d{6}") String pincode, List<Employee> employeeList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.employeeList = employeeList;
	}*/
	
	

}
