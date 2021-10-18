package com.iboarding.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "productfees")
public class Productfees {
	@Id
	private int pid;
	private double card_transaction;
	private double amex_card_transaction;
	private double paypal_card_transaction;
	private double dcc_transaction;
	private double min_discount;
	private double one_time_cost;
	private double monthly_service_cost;

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getCard_transaction() {
		return card_transaction;
	}
	public void setCard_transaction(double card_transaction) {
		this.card_transaction = card_transaction;
	}
	public double getAmex_card_transaction() {
		return amex_card_transaction;
	}
	public void setAmex_card_transaction(double amex_card_transaction) {
		this.amex_card_transaction = amex_card_transaction;
	}
	public double getPaypal_card_transaction() {
		return paypal_card_transaction;
	}
	public void setPaypal_card_transaction(double paypal_card_transaction) {
		this.paypal_card_transaction = paypal_card_transaction;
	}
	public double getDcc_transaction() {
		return dcc_transaction;
	}
	public void setDcc_transaction(double dcc_transaction) {
		this.dcc_transaction = dcc_transaction;
	}
	public double getMin_discount() {
		return min_discount;
	}
	public void setMin_discount(double min_discount) {
		this.min_discount = min_discount;
	}
	public double getOne_time_cost() {
		return one_time_cost;
	}
	public void setOne_time_cost(double one_time_cost) {
		this.one_time_cost = one_time_cost;
	}
	public double getMonthly_service_cost() {
		return monthly_service_cost;
	}
	public void setMonthly_service_cost(double monthly_service_cost) {
		this.monthly_service_cost = monthly_service_cost;
	}
	
	
	public Productfees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Productfees(int pid, double card_transaction, double amex_card_transaction, double paypal_card_transaction,
			double dcc_transaction, double min_discount, double one_time_cost, double monthly_service_cost) {
		super();
		this.pid = pid;
		this.card_transaction = card_transaction;
		this.amex_card_transaction = amex_card_transaction;
		this.paypal_card_transaction = paypal_card_transaction;
		this.dcc_transaction = dcc_transaction;
		this.min_discount = min_discount;
		this.one_time_cost = one_time_cost;
		this.monthly_service_cost = monthly_service_cost;
	}
	@Override
	public String toString() {
		return "Productfees [pid=" + pid + ", card_transaction=" + card_transaction + ", amex_card_transaction="
				+ amex_card_transaction + ", paypal_card_transaction=" + paypal_card_transaction + ", dcc_transaction="
				+ dcc_transaction + ", min_discount=" + min_discount + ", one_time_cost=" + one_time_cost
				+ ", monthly_service_cost=" + monthly_service_cost + "]";
	}
	
	
	
	
}