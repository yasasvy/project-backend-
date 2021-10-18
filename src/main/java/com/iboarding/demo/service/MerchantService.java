package com.iboarding.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iboarding.demo.model.Merchant;
import com.iboarding.demo.repository.MerchantRepository;

@Service
public class MerchantService {
	
	@Autowired
	private MerchantRepository repo;

	public void updateMerchant(Merchant data) {
		repo.save(data);
	}

	
}
