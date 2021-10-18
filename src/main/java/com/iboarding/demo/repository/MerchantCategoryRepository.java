package com.iboarding.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iboarding.demo.model.MerchantCategory;

public interface MerchantCategoryRepository extends JpaRepository<MerchantCategory, Integer> {

}
