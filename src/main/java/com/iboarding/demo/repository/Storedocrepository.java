package com.iboarding.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iboarding.demo.model.Storedocs;

public interface Storedocrepository extends JpaRepository<Storedocs, Integer>{
	public List<Storedocs> deleteByMidAndDoctype(int mid, String doctype);

}
