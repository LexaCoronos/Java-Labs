package org.ntu.mantrov.labs.lab5.model;

public class Adress {

	private String city;
	private String street;
	private int build;
	private int apartment;

	public Adress(String city, String street, int build, int apartment) {
		this.city = city;
		this.street = street;
		this.build = build;
		this.apartment = apartment;
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

	@Override
	public String toString() {
		return "City: " + this.city + " | Street: " + this.street + " | build: " + this.build + " | apartment: " + this.apartment;
	}

}
