package com.iboarding.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PackageMaster")
public class PackageMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pkg_id;
	private String pkg_name;

	@OneToOne(cascade = CascadeType.ALL)
	private PackageChild pc;

	public PackageChild getPc() {
		return pc;
	}

	public void setPc(PackageChild pc) {
		this.pc = pc;
	}

	public PackageMaster() {
		super();
	}

	public PackageMaster(int pkg_id, String pkg_name) {
		super();
		this.pkg_id = pkg_id;
		this.pkg_name = pkg_name;
	}

	public int getPkg_id() {
		return pkg_id;
	}

	public void setPkg_id(int pkg_id) {
		this.pkg_id = pkg_id;
	}

	public String getPkg_name() {
		return pkg_name;
	}

	public void setPkg_name(String pkg_name) {
		this.pkg_name = pkg_name;
	}

}