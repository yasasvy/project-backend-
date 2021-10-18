package com.iboarding.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "storedocslist")
public class Storedoclist {
	@Id
	private int sdlid;
	private String sdlname;
	public int getSdlid() {
		return sdlid;
	}
	public void setSdlid(int sdlid) {
		this.sdlid = sdlid;
	}
	public String getSdlname() {
		return sdlname;
	}
	public void setSdlname(String sdlname) {
		this.sdlname = sdlname;
	}
	@Override
	public String toString() {
		return "storedoclist [sdlid=" + sdlid + ", sdlname=" + sdlname + "]";
	}
	public Storedoclist(int sdlid, String sdlname) {
		super();
		this.sdlid = sdlid;
		this.sdlname = sdlname;
	}
	public Storedoclist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}