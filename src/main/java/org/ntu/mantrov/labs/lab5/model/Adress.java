package org.ntu.mantrov.labs.lab5.model;

import java.util.List;

public class Adress {

	private List<Citizen> list;
	private String city;
	private String street;
	private int build;
	private int apartment;

	public Adress(List<Citizen> list, String city, String street, int build, int apartment) {
		super();
		this.list = list;
		this.city = city;
		this.street = street;
		this.build = build;
		this.apartment = apartment;
	}

	public List<Citizen> getList() {
		return list;
	}

	public void setList(List<Citizen> list) {
		this.list = list;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getBuild() {
		return build;
	}

	public void setBuild(int build) {
		this.build = build;
	}

	public int getApartment() {
		return apartment;
	}

	public void setApartment(int apartment) {
		this.apartment = apartment;
	}

}
