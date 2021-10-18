package com.iboarding.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.iboarding.demo.model.Docs;

public interface DocRepository extends JpaRepository<Docs, Integer> {
//	Optional<Docs> findByName(String name);
	public List<Docs> deleteByMidAndDocType(int mid, String docType);

	public Docs findByMidAndDocType(int mid, String type);
	
	@Transactional
	@Modifying 
	@Query("UPDATE Docs mt SET mt.docname=?1 WHERE mt.mid=?2 AND mt.docType=?3")
	void update(String name ,int mid, String docType);

}
