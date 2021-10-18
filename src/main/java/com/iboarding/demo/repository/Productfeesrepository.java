package com.iboarding.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.iboarding.demo.model.Productfees;

public interface Productfeesrepository extends JpaRepository<Productfees, Integer>{


	@Transactional
	@Modifying 
	@Query("FROM Productfees pf WHERE pf.pid=?1")
	List<Productfees> findFeesById(int pkg_id);
	
	

}
