package com.iboarding.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iboarding.demo.model.BusinessType;
import com.iboarding.demo.model.Currency;
import com.iboarding.demo.model.MerchantCategory;
import com.iboarding.demo.model.doc_master;
import com.iboarding.demo.model.doc_master1;
import com.iboarding.demo.repository.doc_master1Repossitory;
import com.iboarding.demo.service.NewMerchantService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iboarding.demo.model.BusinessType;
import com.iboarding.demo.model.Currency;
import com.iboarding.demo.model.MerchantCategory;




@RestController
public class NewMerchantController {
    int id =0;
    int j =0;

    @Autowired
	private doc_master1Repossitory docmaster1;
    
     

    @Autowired
    private NewMerchantService service;
    
    @GetMapping("/getBusinessType")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<BusinessType> getBusinessType()
    {
        return service.getBusinessType();
    }
    
    
    @GetMapping("/getMerchantCategory")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MerchantCategory> getMerchantCategory()
    {
        return service.getMerchantCategory();
    }
    
    @GetMapping("/getCurrency")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Currency> getCurency()
    {
        return service.getCurrency();
    }
    
    
    
    
    
    @GetMapping("/getdocmaster1")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<doc_master1> getdocmaster1()
    { 
//    	if(id==0) {	
//    		docmaster1.deleteAll();
//   		}  
//    	
//    	if(id==0)
//    {doc_master1 s= new doc_master1(1,2,"New Merchant Normal Rental");
//    doc_master1 p= new doc_master1(2,3,"Normal POS & Mobile Service");
//    doc_master1 q= new doc_master1(3,3,"Prepaid POS Package ");
//    docmaster1.save(s);
//    docmaster1.save(p);   
//    
//    	int j =service.putvalue(q);
//    }
//    	id++;
//    	System.out.println(service.getdocmaster1());
        return service.getdocmaster1();
    }
    
    
    
    
    
@GetMapping("/getdocmaster")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<doc_master> getdocmaster()
    {
        return service.getdocmaster();
    }
    
    
}