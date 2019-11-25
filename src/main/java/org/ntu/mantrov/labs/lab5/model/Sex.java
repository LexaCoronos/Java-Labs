package org.ntu.mantrov.labs.lab5.model;

public enum Sex {
	
	MALE("Мужчина", "Man", "Чоловiк"),
	FEMALE("Девушка", "Woman", "Жiнка");
	
	private String ru;
	private String en;
	private String ua;
	
	Sex(String ru, String en, String ua) {
		this.ru = ru;
		this.en = en;
		this.ua = ua;
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
