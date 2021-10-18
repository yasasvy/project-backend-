package com.iboarding.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PackageChild")
public class PackageChild {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pkg_id;
	private String pkg_name;
	private String summary;
	private String pkg_info;
	private String terminal_info;
	private String parameters;
	private String added_services;
	private String package_acceptance;
	private String package_schemes;
	private String package_card_types;
	private String package_currency_acceptance;
	private String package_tariff;
	private String terminal_type;

	public PackageChild() {
		super();
	}


	public PackageChild(int pkg_id, String pkg_name, String summary, String pkg_info, String terminal_info,
			String parameters, String added_services, String package_acceptance, String package_schemes,
			String package_card_types, String package_currency_acceptance, String package_tariff,
			String terminal_type) {
		super();
		this.pkg_id = pkg_id;
		this.pkg_name = pkg_name;
		this.summary = summary;
		this.pkg_info = pkg_info;
		this.terminal_info = terminal_info;
		this.parameters = parameters;
		this.added_services = added_services;
		this.package_acceptance = package_acceptance;
		this.package_schemes = package_schemes;
		this.package_card_types = package_card_types;
		this.package_currency_acceptance = package_currency_acceptance;
		this.package_tariff = package_tariff;
		this.terminal_type = terminal_type;
	}


	
	public String getPackage_acceptance() {
		return package_acceptance;
	}


	public void setPackage_acceptance(String package_acceptance) {
		this.package_acceptance = package_acceptance;
	}


	public String getPackage_schemes() {
		return package_schemes;
	}


	public void setPackage_schemes(String package_schemes) {
		this.package_schemes = package_schemes;
	}


	public String getPackage_card_types() {
		return package_card_types;
	}


	public void setPackage_card_types(String package_card_types) {
		this.package_card_types = package_card_types;
	}


	public String getPackage_currency_acceptance() {
		return package_currency_acceptance;
	}


	public void setPackage_currency_acceptance(String package_currency_acceptance) {
		this.package_currency_acceptance = package_currency_acceptance;
	}


	public String getPackage_tariff() {
		return package_tariff;
	}


	public void setPackage_tariff(String package_tariff) {
		this.package_tariff = package_tariff;
	}


	public String getTerminal_type() {
		return terminal_type;
	}


	public void setTerminal_type(String terminal_type) {
		this.terminal_type = terminal_type;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPkg_info() {
		return pkg_info;
	}

	public void setPkg_info(String pkg_info) {
		this.pkg_info = pkg_info;
	}

	public String getTerminal_info() {
		return terminal_info;
	}

	public void setTerminal_info(String terminal_info) {
		this.terminal_info = terminal_info;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getAdded_services() {
		return added_services;
	}

	public void setAdded_services(String added_services) {
		this.added_services = added_services;
	}

}
