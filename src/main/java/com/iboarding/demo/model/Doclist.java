package com.iboarding.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doclist")
public class Doclist 
{
	@Id
	private int docid;
	private String docname;
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public String getDocname() {
		return docname;
	}
	public void setDocname(String docname) {
		this.docname = docname;
	}
	@Override
	public String toString() {
		return "doclist [docid=" + docid + ", docname=" + docname + "]";
	}
	public Doclist(int docid, String docname) {
		super();
		this.docid = docid;
		this.docname = docname;
	}
	public Doclist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}