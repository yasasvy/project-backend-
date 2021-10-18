package com.iboarding.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iboarding.demo.model.BusinessType;
import com.iboarding.demo.model.Currency;
import com.iboarding.demo.model.MerchantCategory;
import com.iboarding.demo.model.doc_master;
import com.iboarding.demo.model.doc_master1;
import com.iboarding.demo.repository.BusinessTypeRepository;
import com.iboarding.demo.repository.CurrencyRepository;
import com.iboarding.demo.repository.MerchantCategoryRepository;
import com.iboarding.demo.repository.doc_master1Repossitory;
import com.iboarding.demo.repository.doc_masterRepository;

@Service
public class NewMerchantService {

	@Autowired
	private BusinessTypeRepository repoBusinessType;
	@Autowired
	private MerchantCategoryRepository repoMerchantCategory;
	@Autowired
	private CurrencyRepository repoCurrency;

	public List<BusinessType> getBusinessType() {
		return repoBusinessType.findAll();
	}
	
	public List<MerchantCategory> getMerchantCategory() {
		return repoMerchantCategory.findAll();
	}
	
	public List<Currency> getCurrency() {
		return repoCurrency.findAll();
	}
	

	@Autowired
	private doc_masterRepository doc_mas_repo;
	
	@Autowired
	private doc_master1Repossitory doc_mas1_repo;
	
	public int putvalue(doc_master1 doc_master1) {
		doc_mas1_repo.save(doc_master1);
		
		return 1;
	}
	
	
	public List<doc_master> getdocmaster() {
		return doc_mas_repo.findAll();
	}
	
	public List<doc_master1> getdocmaster1() {
		return doc_mas1_repo.findAll();
	}
}
