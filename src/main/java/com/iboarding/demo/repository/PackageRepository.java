package com.iboarding.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.iboarding.demo.model.PackageChild;

public interface PackageRepository extends JpaRepository<PackageChild, Integer>{

//	@Transactional
//	@Modifying 
	@Query("FROM PackageChild pc WHERE pc.pkg_id=?1")
	List<PackageChild> getPkgDetails(int pkgId);

	

}
