package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
