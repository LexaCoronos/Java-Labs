package org.ntu.mantrov.labs.lab5.controller;

import java.util.List;
import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.Var;
import org.ntu.mantrov.labs.lab5.model.Adress;
import org.ntu.mantrov.labs.lab5.model.Citizen;

public class AdressCreator {
	private static Scanner scanner;
	
	public AdressCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public static Adress createUnivesity() {
		Adress adress = new Adress(getCitizenList(), getAdressCity(), getAdressStreet(), getAdressBuild(), getAdressApartment());
		return adress;
	}
	
	private static List<Citizen> getCitizenList() {
		return null;
	}

	private static int getAdressApartment() {
		return Var.getRandInt(100);
	}

	private static int getAdressBuild() {
		return Var.getRandInt(100);
	}

	private static String getAdressStreet() {
		return Var.getRandString(10);
	}

	private static String getAdressCity() {
		return Var.getRandString(10);
	}

	@SuppressWarnings("static-access")
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}
}
