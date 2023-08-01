/*package com.cms.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.cms.entity.Company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
	private int id;
	@NotNull(message="Name of Employee can never be null")
	@NotBlank(message="Name of Employee can never be empty")
	@Size(min=4,max=30)
	private String name;
	@Email(message="recheck the entered email id")
	private String email;
	//Company company;
}*/
