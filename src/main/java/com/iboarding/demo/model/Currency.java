package com.iboarding.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Currency")
public class Currency 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String currency;
	
	public Currency() 
	{
		super();
	}

	public Currency(int id, String currency) 
	{
		super();
		this.id = id;
		this.currency = currency;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{	
		this.id = id;
	}

	public String getCurrency() 
	{
		return currency;
	}

	public void setCurrency(String currency) 
	{
		this.currency = currency;
	}
}