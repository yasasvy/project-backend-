package com.iboarding.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iboarding.demo.model.Merchant;
import com.iboarding.demo.model.MerchantTemp;
import com.iboarding.demo.model.User;
import com.iboarding.demo.service.MerchantService;
import com.iboarding.demo.service.MerchantTempService;

@RestController
public class SaveAndNextController {

	@Autowired
	private MerchantTempService service;
	
	@Autowired
	private MerchantService serve;

	@PostMapping("/saveandnextnewmerchant")
	@CrossOrigin(origins = "http://localhost:4200")
	public int saveandnext_newmerchant(@RequestBody MerchantTemp data) throws Exception {
//		System.out.println(data);
		service.put_newMerchant(data);
		return data.getMerchant_id();
	}
	
	@PostMapping("/postpkgid")
	@CrossOrigin(origins = "http://localhost:4200")
	public int postPackageId(@RequestBody MerchantTemp data) throws Exception {
//		System.out.println(data);
		service.update_pkgId(data);
		return data.getPkg_id();
	}
	
	@PostMapping("/businessinfo")
	@CrossOrigin(origins = "http://localhost:4200")
	public String registerbusinessinfo(@RequestBody MerchantTemp data) throws Exception {
//		System.out.println(data);
		service.updateBusinessInfo(data);
		return "successful";
	}

	@PostMapping("/postprincinfo")
	@CrossOrigin(origins = "http://localhost:4200")
	public String registerprincinfo(@RequestBody MerchantTemp data) throws Exception {
//	    	System.out.println(data);
		service.updatePrincipalInfo(data);
		return "successful";
	}

	@PostMapping("/businesssummary")
	@CrossOrigin(origins = "http://localhost:4200")
	public String registerbusinessSummary(@RequestBody MerchantTemp data) throws Exception {
//		System.out.println(data);
		service.updateBusinesssummary(data);
		return "successful";
	}
	

	@PostMapping("/saveandnextannualturnover")
	@CrossOrigin(origins = "http://localhost:4200")
	public String saveandnext_annualturnover(@RequestBody MerchantTemp data) throws Exception {
//		System.out.println(data);
		service.updateAnnualturnover(data);
		return "successful";
	}

	@PostMapping("/saveandnextclientproductpreferences")
	@CrossOrigin(origins = "http://localhost:4200")
	public String saveandnext_clientProductPreferences(@RequestBody MerchantTemp data) throws Exception {
//		System.out.println(data);
		service.updateClientProductPreference(data);
		return "successful";
	}
	
	
	@GetMapping("/getmerchtemp")
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<MerchantTemp> getMerchTemp(@RequestParam int merch_id) throws Exception{
		return service.getMerchantTemp(merch_id); 
	}

	@PostMapping("/finalregister")
	@CrossOrigin(origins = "http://localhost:4200")
	public String finalregisterMerchant(@RequestBody Merchant data) throws Exception{
		serve.updateMerchant(data);
		return "successful";
	}
	
	@PostMapping("/updateTempMerchant")
	@CrossOrigin(origins = "http://localhost:4200")
	public String updateTempMerchant(@RequestParam int merch_id, @RequestBody Merchant data) throws Exception{
		service.updateTempMerchant(merch_id, data);
		return "successful";
	}
	
	


}
