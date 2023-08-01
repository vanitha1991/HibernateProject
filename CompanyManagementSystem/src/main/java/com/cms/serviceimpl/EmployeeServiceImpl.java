/*package com.cms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dto.EmployeeDTO;
import com.cms.entity.Company;
import com.cms.entity.Employee;
import com.cms.repository.CompanyRepository;
import com.cms.repository.EmployeRepository;
//import com.cms.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeRepository employeeRepository ;
	
	@Autowired
	CompanyRepository companyRepository;

	
	@Override
	public Employee assignCompanyToEmployee(int empId, int companyId) {
		Employee employee=employeeRepository.findById(empId).get();
		Company company=companyRepository.findById(companyId).get();
		employee.setCompany(company);
		return employeeRepository.save(employee);
	
	}

	

}*/
