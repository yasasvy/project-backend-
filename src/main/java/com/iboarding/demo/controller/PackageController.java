package com.iboarding.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iboarding.demo.model.BusinessType;
import com.iboarding.demo.model.PackageChild;
import com.iboarding.demo.service.MerchantTempService;
import com.iboarding.demo.service.PackageService;

@RestController
public class PackageController {
	
	@Autowired
	private PackageService service;


    @GetMapping("/getPackages")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<PackageChild> getPackages()
    {
        return service.getPackageInfo();
    }
    
    
    @GetMapping("/getpkgdetails")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<PackageChild> getPackagedetails(@RequestParam int pkgId)
    {
        return service.getPkgDetails(pkgId);
    }
 
    
}
