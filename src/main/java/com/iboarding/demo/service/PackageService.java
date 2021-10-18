package com.iboarding.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iboarding.demo.model.PackageChild;
import com.iboarding.demo.repository.PackageRepository;

@Service
public class PackageService {
	
	@Autowired
	private PackageRepository repo;
	
	public List<PackageChild> getPackageInfo() {
		return repo.findAll();
	}

	public List<PackageChild> getPkgDetails(int pkgId) {
		return repo.getPkgDetails(pkgId);
	}
	

}
