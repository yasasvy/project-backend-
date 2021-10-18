package com.iboarding.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iboarding.demo.model.Doclistpkg;

public interface Doclistpkgrepository extends JpaRepository<Doclistpkg, Integer>{
	public List<Doclistpkg> findBypkgid(int pkgid);

}
