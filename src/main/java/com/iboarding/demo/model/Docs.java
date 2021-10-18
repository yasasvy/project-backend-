package com.iboarding.demo.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Docs")
public class Docs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docid;

	private int mid;
	private String docType;

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

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
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
		return "Docs [docid=" + docid + ", mid=" + mid + ", docType=" + docType + ",  docname=" + docname + "]";
	}

	public Docs(int mid, String docType, byte[] data, String docname) {
		super();
		this.mid = mid;
		this.docType = docType;
		this.data = data;
		this.docname = docname;
	}

	public Docs() {
		super();
		// TODO Auto-generated constructor stub
	}

}
