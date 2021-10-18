package com.iboarding.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doclistpkg")
public class Doclistpkg 
{
	@Id
	private int listid;
	private int pkgid;
	private int docid;
	private String docname ;
	public int getListid() {
		return listid;
	}
	public void setListid(int listid) {
		this.listid = listid;
	}
	public int getPkgid() {
		return pkgid;
	}
	public void setPkgid(int pkgid) {
		this.pkgid = pkgid;
	}
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
		return "doclistpkg [listid=" + listid + ", pkgid=" + pkgid + ", docid=" + docid + ", docname=" + docname + "]";
	}
	public Doclistpkg(int listid, int pkgid, int docid, String docname) {
		super();
		this.listid = listid;
		this.pkgid = pkgid;
		this.docid = docid;
		this.docname = docname;
	}
	public Doclistpkg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	