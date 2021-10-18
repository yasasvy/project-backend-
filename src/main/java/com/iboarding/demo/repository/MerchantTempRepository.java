package com.iboarding.demo.repository;


import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iboarding.demo.model.Merchant;
import com.iboarding.demo.model.MerchantTemp;


public interface MerchantTempRepository extends JpaRepository<MerchantTemp, Integer>{

	@Transactional
	@Modifying 
	@Query("UPDATE MerchantTemp mt SET mt.pkg_id=?1 WHERE mt.merchant_id=?2")
	void put_pkgId(int pkg_id, int merchant_id);

	
	@Transactional
	@Modifying 
	@Query("UPDATE MerchantTemp mt SET mt.businessName=?2, mt.legalName=?3, mt.businessRegistrationNumber=?4, mt.dateIncorporated=?5, mt.businessWebsite=?6, mt.emailAddress=?7, mt.taxIdentificationNumber=?8, mt.isdn=?9, mt.bankAccountNumber=?10, mt.routingNumber=?11, mt.branchname=?12 WHERE mt.merchant_id=?1")
	void update_businessInfo(int merchant_id, String businessName, String legalName, String businessRegistrationNumber,
			Date dateIncorporated, String businessWebsite, String emailAddress, String taxIdentificationNumber,
			String isdn, Long bankAccountNumber, String routingNumber, String branchname);

	@Transactional
	@Modifying 
	@Query("UPDATE MerchantTemp mt SET mt.firstname=?2, mt.lastname=?3, mt.dob=?4, mt.address=?5, mt.city=?6, mt.state=?7, mt.pincode=?8, mt.country=?9, mt.phonenumber=?10 WHERE mt.merchant_id=?1")
	void update_principalInfo(int merchant_id, String firstname, String lastname, Date dob, String address,
			String city, String state, String pincode, String country, String phonenumber);


	@Transactional
	@Modifying 
	@Query("UPDATE MerchantTemp mt SET mt.summary=?2, mt.srnum=?3 WHERE mt.merchant_id=?1")
	void updateBusinesssummary(int merchant_id, String summary, String srnum);


	@Transactional
	@Modifying 
	@Query("UPDATE MerchantTemp mt SET mt.total_amount=?2, mt.annualcard_turnover=?3, mt.average_ticket=?4, mt.ecomm_turnover=?5, mt.dcc_turnover=?6 WHERE mt.merchant_id=?1")
	void updateAnnualturnover(int merchant_id, String total_amount, String annualcard_turnover, String average_ticket,
			String ecomm_turnover, String dcc_turnover);

	@Transactional
	@Modifying 
	@Query("UPDATE MerchantTemp mt SET mt.card_capture=?2, mt.one_zero_nine_nine=?3, mt.payment_advice_required=?4, mt.payment_advice_type=?5, mt.payment_advice_frequency=?6  WHERE mt.merchant_id=?1")
	void updateClientProductPreference(int merchant_id, String card_capture, String one_zero_nine_nine,
			String payment_advice_required, String payment_advice_type, String payment_advice_frequency);


	
	@Transactional
	@Modifying 
	@Query("UPDATE MerchantTemp mt SET mt.business_type=?2, mt.merchant_category=?3, mt.merchant_size=?4, mt.currency=?5, mt.minimum=?6, mt.maximum=?7 WHERE mt.merchant_id=?1")
	void updateTempMerchant(int merch_id, String business_type, String merchant_category, String merchant_size,
			String currency, int minimum, int maximum);






	




	

	
}
