package com.iboarding.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doc_master")
public class doc_master{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pkgid;
	private String doctype;
	public doc_master() {
		super();
		// TODO Auto-generated constructor stub
	}
	public doc_master(int pkgid, String doctype) {
		super();
		this.pkgid = pkgid;
		this.doctype = doctype;
	}
	@Override
	public String toString() {
		return "doc_master [pkgid=" + pkgid + ", doctype=" + doctype + "]";
	}
	public int getPkgid() {
		return pkgid;
	}
	public void setPkgid(int pkgid) {
		this.pkgid = pkgid;
	}
	public String getDoctype() {
		return doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	
}