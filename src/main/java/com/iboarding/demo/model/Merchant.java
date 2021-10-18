package com.iboarding.demo.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "merchant")
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int merchant_id;
	private int user_id;
	private String business_type;
	private String merchant_category;
	private String merchant_size;
	private String currency;
	private int minimum;
	private int maximum;
	private int pkg_id;
	private String total_amount;
	private String average_ticket;
	private String ecomm_turnover;
	private String annualcard_turnover;
	private String dcc_turnover;
	private String card_capture;
	private String one_zero_nine_nine;
	private String payment_advice_required;
	private String payment_advice_type;
	private String payment_advice_frequency;

	private String businessName;
	private String legalName;
	private String businessRegistrationNumber;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dateIncorporated;
	private String businessWebsite;
	private String emailAddress;
	private String taxIdentificationNumber;
	private String isdn;
	private Long bankAccountNumber;
	private String routingNumber; 
	private String branchname;

	private String firstname;
	private String lastname;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dob;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private String country;
	private String phonenumber;

	private String summary;
	private String srnum;

	private String active;

	public Merchant() {
		super();
	}


	
	public Merchant(int merchant_id, int user_id, String business_type, String merchant_category, String merchant_size,
			String currency, int minimum, int maximum, int pkg_id, String total_amount, String average_ticket,
			String ecomm_turnover, String annualcard_turnover, String dcc_turnover, String card_capture,
			String one_zero_nine_nine, String payment_advice_required, String payment_advice_type,
			String payment_advice_frequency, String businessName, String legalName, String businessRegistrationNumber,
			Date dateIncorporated, String businessWebsite, String emailAddress, String taxIdentificationNumber,
			String isdn, Long bankAccountNumber, String routingNumber, String branchname, String firstname,
			String lastname, Date dob, String address, String city, String state, String pincode, String country,
			String phonenumber, String summary, String srnum, String active) {
		super();
		this.merchant_id = merchant_id;
		this.user_id = user_id;
		this.business_type = business_type;
		this.merchant_category = merchant_category;
		this.merchant_size = merchant_size;
		this.currency = currency;
		this.minimum = minimum;
		this.maximum = maximum;
		this.pkg_id = pkg_id;
		this.total_amount = total_amount;
		this.average_ticket = average_ticket;
		this.ecomm_turnover = ecomm_turnover;
		this.annualcard_turnover = annualcard_turnover;
		this.dcc_turnover = dcc_turnover;
		this.card_capture = card_capture;
		this.one_zero_nine_nine = one_zero_nine_nine;
		this.payment_advice_required = payment_advice_required;
		this.payment_advice_type = payment_advice_type;
		this.payment_advice_frequency = payment_advice_frequency;
		this.businessName = businessName;
		this.legalName = legalName;
		this.businessRegistrationNumber = businessRegistrationNumber;
		this.dateIncorporated = dateIncorporated;
		this.businessWebsite = businessWebsite;
		this.emailAddress = emailAddress;
		this.taxIdentificationNumber = taxIdentificationNumber;
		this.isdn = isdn;
		this.bankAccountNumber = bankAccountNumber;
		this.routingNumber = routingNumber;
		this.branchname = branchname;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.phonenumber = phonenumber;
		this.summary = summary;
		this.srnum = srnum;
		this.active = active;
	}



	public String getBranchname() {
		return branchname;
	}



	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}



	public String getAnnualcard_turnover() {
		return annualcard_turnover;
	}

	public void setAnnualcard_turnover(String annualcard_turnover) {
		this.annualcard_turnover = annualcard_turnover;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSrnum() {
		return srnum;
	}

	public void setSrnum(String srnum) {
		this.srnum = srnum;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getBusinessRegistrationNumber() {
		return businessRegistrationNumber;
	}

	public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
		this.businessRegistrationNumber = businessRegistrationNumber;
	}

	public Date getDateIncorporated() {
		return dateIncorporated;
	}

	public void setDateIncorporated(Date dateIncorporated) {
		this.dateIncorporated = dateIncorporated;
	}

	public String getBusinessWebsite() {
		return businessWebsite;
	}

	public void setBusinessWebsite(String businessWebsite) {
		this.businessWebsite = businessWebsite;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	public String getIsdn() {
		return isdn;
	}

	public void setIsdn(String isdn) {
		this.isdn = isdn;
	}

	public Long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(Long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}


	public String getAverage_ticket() {
		return average_ticket;
	}

	public void setAverage_ticket(String average_ticket) {
		this.average_ticket = average_ticket;
	}

	public String getEcomm_turnover() {
		return ecomm_turnover;
	}

	public void setEcomm_turnover(String ecomm_turnover) {
		this.ecomm_turnover = ecomm_turnover;
	}

	public String getDcc_turnover() {
		return dcc_turnover;
	}

	public void setDcc_turnover(String dcc_turnover) {
		this.dcc_turnover = dcc_turnover;
	}

	public String getCard_capture() {
		return card_capture;
	}

	public void setCard_capture(String card_capture) {
		this.card_capture = card_capture;
	}

	public String getOne_zero_nine_nine() {
		return one_zero_nine_nine;
	}

	public void setOne_zero_nine_nine(String one_zero_nine_nine) {
		this.one_zero_nine_nine = one_zero_nine_nine;
	}

	public String getPayment_advice_required() {
		return payment_advice_required;
	}

	public void setPayment_advice_required(String payment_advice_required) {
		this.payment_advice_required = payment_advice_required;
	}

	public String getPayment_advice_type() {
		return payment_advice_type;
	}

	public void setPayment_advice_type(String payment_advice_type) {
		this.payment_advice_type = payment_advice_type;
	}

	public String getPayment_advice_frequency() {
		return payment_advice_frequency;
	}

	public void setPayment_advice_frequency(String payment_advice_frequency) {
		this.payment_advice_frequency = payment_advice_frequency;
	}

	public int getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
	}

	public String getBusiness_type() {
		return business_type;
	}

	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}

	public String getMerchant_category() {
		return merchant_category;
	}

	public void setMerchant_category(String merchant_category) {
		this.merchant_category = merchant_category;
	}

	public String getMerchant_size() {
		return merchant_size;
	}

	public void setMerchant_size(String merchant_size) {
		this.merchant_size = merchant_size;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getPkg_id() {
		return pkg_id;
	}

	public void setPkg_id(int pkg_id) {
		this.pkg_id = pkg_id;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
}