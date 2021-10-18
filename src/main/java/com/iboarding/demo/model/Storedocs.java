package com.iboarding.demo.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "storedoc")
public class Storedocs {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private int docid;
	
	private int mid;
	private String doctype;
	
	@Lob
	private byte[] data;
	
	private String docname;

	public int getDocid() {
		return docid;
	}

	public void setDocid(int docid) {
		this.docid = docid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getDoctype() {
		return doctype;
	}

	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	@Override
	public String toString() {
		return "storedocs [docid=" + docid + ", mid=" + mid + ", doctype=" + doctype + ", docname=" + docname + "]";
	}

	public Storedocs( int mid, String doctype, byte[] data, String docname) {
		super();
		this.mid = mid;
		this.doctype = doctype;
		this.data = data;
		this.docname = docname;
	}

	public Storedocs() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}