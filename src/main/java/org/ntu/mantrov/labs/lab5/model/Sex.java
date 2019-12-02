package org.ntu.mantrov.labs.lab5.model;

public enum Sex {
	
	MALE(1, "Мужчина", "Man", "Чоловiк"),
	FEMALE(2, "Девушка", "Woman", "Жiнка");
	
	private int value;
	private String ru;
	private String en;
	private String ua;
	
	Sex(int value, String ru, String en, String ua) {
		this.value = value;
		this.ru = ru;
		this.en = en;
		this.ua = ua;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getRu() {
		return ru;
	}

	public void setRu(String ru) {
		this.ru = ru;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}
}
