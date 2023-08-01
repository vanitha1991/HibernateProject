package com.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cms.dto.CompanyDTO;
import com.cms.entity.Company;

public interface CompanyService {
	CompanyDTO addCompany(Company company);
	List<CompanyDTO> getAllCompanies();
	CompanyDTO getCompanyById(int id);
	CompanyDTO updateCompany(int id,Company company);
	String deleteCompany(int id);
	

}
