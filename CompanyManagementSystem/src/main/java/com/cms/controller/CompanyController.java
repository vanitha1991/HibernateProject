package com.cms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.dto.CompanyDTO;
import com.cms.entity.Company;
import com.cms.exception.ResourceNotFoundException;
import com.cms.service.CompanyService;
import com.cms.util.CompanyConverter;

@RestController
public class CompanyController 
{
	@Autowired
	CompanyService companyService ;
	
	@Autowired
	CompanyConverter companyConverter;
	
	@PostMapping("/addCompanies")
	ResponseEntity<CompanyDTO> addCompany(@RequestBody @Valid CompanyDTO companyDTO)
	{ 
		
		Company company=companyConverter.convertToCompanyEntity(companyDTO);
		return new ResponseEntity<CompanyDTO>(companyService.addCompany(company),HttpStatus.CREATED);
	}
	
	@GetMapping("/getCompanyById/{id}")
	ResponseEntity<CompanyDTO> getCompanyById(@PathVariable int id)
	{
		return new ResponseEntity<CompanyDTO>(companyService.getCompanyById(id),HttpStatus.FOUND);
	}
	
	@GetMapping("/getAllCompany")
	ResponseEntity<List<CompanyDTO>> getCompanies()
	{
		return new ResponseEntity<List<CompanyDTO>>(companyService.getAllCompanies(),HttpStatus.FOUND);
	}
	
	@PutMapping("/updateCompany/{id}")
	ResponseEntity<CompanyDTO> updateCompany(@PathVariable int id,@RequestBody CompanyDTO companyDTO)
	{
		Company company=companyConverter.convertToCompanyEntity(companyDTO);
		return new ResponseEntity<CompanyDTO>(companyService.updateCompany(id, company),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/deleteCompanyById/{id}")
	ResponseEntity<String> deleteCompanyById(@PathVariable int id)
	{
		return new ResponseEntity(companyService.deleteCompany(id),HttpStatus.OK);
	}
	
	
	
	
}
