package com.cms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dto.CompanyDTO;
import com.cms.entity.Company;
import com.cms.repository.CompanyRepository;
import com.cms.service.CompanyService;
import com.cms.util.CompanyConverter;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	CompanyConverter companyConverter;

	@Override
	public CompanyDTO addCompany(Company company) {
		Company comp=companyRepository.save(company);
		return companyConverter.convertToCompanyDTO(comp);
	}

	@Override
	public List<CompanyDTO> getAllCompanies() {
		List<Company> companies=companyRepository.findAll();
		
		//list of DTO type
		List<CompanyDTO> dtoList=new ArrayList<>();
		for(Company c:companies)
		{
			dtoList.add(companyConverter.convertToCompanyDTO(c));
		}
		return dtoList;
		}

	@Override
	public CompanyDTO getCompanyById(int id) {
		Company company=companyRepository.findById(id).get();
		return companyConverter.convertToCompanyDTO(company);
	}

	@Override
	public CompanyDTO updateCompany(int id, Company company) {
		Company c=companyRepository.findById(id).get();
		c.setName(company.getName());
		c.setAddress(company.getAddress());
		c.setPincode(company.getPincode());
		Company comp=companyRepository.save(c);
		return companyConverter.convertToCompanyDTO(comp);
	}

	@Override
	public String deleteCompany(int id) {
		companyRepository.deleteById(id);
		
		return "Company details got deleted successfuly";
	}
	

	

}
