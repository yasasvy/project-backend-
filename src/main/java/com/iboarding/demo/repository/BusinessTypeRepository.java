package com.iboarding.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iboarding.demo.model.BusinessType;

public interface BusinessTypeRepository extends JpaRepository<BusinessType, Integer> {

}

