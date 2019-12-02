package org.ntu.mantrov.labs.lab5.model;

public class Citizen {
	
	private String name;
	private int age;
	private Sex sex;
	private Adress adress;

	public Citizen(String name, int age, Sex sex, Adress adress) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " | Age: " + this.age + " | Sex: " + this.sex + " | Adress: [" + this.adress + "]";
	}
}
