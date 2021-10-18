package com.iboarding.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doc_master1")
public class doc_master1{
	@Id
	private int pkgid;
	private int noofdoc;
	private String pkgname;
	
	

	
	public doc_master1(int pkgid, int noofdoc, String pkgname) {
		super();
		this.pkgid = pkgid;
		this.noofdoc = noofdoc;
		this.pkgname = pkgname;
	}

	public doc_master1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getPkgname() {
		return pkgname;
	}
	public void setPkgname(String pkgname) {
		this.pkgname = pkgname;
	}
	public int getPkgid() {
		return pkgid;
	}
	public void setPkgid(int pkgid) {
		this.pkgid = pkgid;
	}
	public int getNoofdoc() {
		return noofdoc;
	}
	public void setNoofdoc(int noofdoc) {
		this.noofdoc = noofdoc;
	}

	@Override
	public String toString() {
		return "doc_master1 [pkgid=" + pkgid + ", noofdoc=" + noofdoc + ", pkgname=" + pkgname + "]";
	}
	
}