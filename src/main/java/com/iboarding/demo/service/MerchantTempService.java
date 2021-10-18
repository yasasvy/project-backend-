package com.iboarding.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iboarding.demo.model.Merchant;
import com.iboarding.demo.model.MerchantTemp;
import com.iboarding.demo.repository.MerchantTempRepository;

@Service
public class MerchantTempService {
	

	@Autowired
	private MerchantTempRepository repo;
	
	public void put_newMerchant(MerchantTemp data) {
		 repo.save(data);
	}
	
	
	public void update_pkgId(MerchantTemp data) {
		repo.put_pkgId(data.getPkg_id(), data.getMerchant_id());
	}


	public void updateBusinessInfo(MerchantTemp data) {
		repo.update_businessInfo(data.getMerchant_id() ,data.getBusinessName(), data.getLegalName(), data.getBusinessRegistrationNumber(), data.getDateIncorporated(), data.getBusinessWebsite(), data.getEmailAddress(), data.getTaxIdentificationNumber(), data.getIsdn(), data.getBankAccountNumber(), data.getRoutingNumber(), data.getBranchname());
		
	}


	public void updatePrincipalInfo(MerchantTemp data) {
		repo.update_principalInfo(data.getMerchant_id(),data.getFirstname(),data.getLastname(),data.getDob(),data.getAddress(),data.getCity(),data.getState(),data.getPincode(),data.getCountry(),data.getPhonenumber());
		
	}


	public void updateBusinesssummary(MerchantTemp data) {
		repo.updateBusinesssummary(data.getMerchant_id(), data.getSummary(), data.getSrnum());
		
	}


	public void updateAnnualturnover(MerchantTemp data) {
		repo.updateAnnualturnover(data.getMerchant_id(), data.getTotal_amount(), data.getAnnualcard_turnover(), data.getAverage_ticket(), data.getEcomm_turnover(), data.getDcc_turnover());
		
	}


	public void updateClientProductPreference(MerchantTemp data) {
		repo.updateClientProductPreference(data.getMerchant_id(), data.getCard_capture(), data.getOne_zero_nine_nine(), data.getPayment_advice_required(), data.getPayment_advice_type(), data.getPayment_advice_frequency());
		
	}

	
	public Optional<MerchantTemp> getMerchantTemp(int merch_id) {
		return repo.findById(merch_id);
	}


	public void updateTempMerchant(int merch_id, Merchant data) {
		repo.updateTempMerchant(merch_id, data.getBusiness_type(), data.getMerchant_category(), data.getMerchant_size(), data.getCurrency(), data.getMinimum(), data.getMaximum());
	}




	




	

}
