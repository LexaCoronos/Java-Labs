package org.ntu.mantrov.labs.lab5.controller;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.GenerateVariables;
import org.ntu.mantrov.labs.lab5.model.Adress;

public class AdressCreator {
	private static Scanner scanner;
	
	public AdressCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public static Adress createAdress() {
		Adress adress = new Adress(getAdressCity(), getAdressStreet(), getAdressBuild(), getAdressApartment());
		return adress;
	}

	private static int getAdressApartment() {
		return GenerateVariables.getRandInt(100);
	}

	private static int getAdressBuild() {
		return GenerateVariables.getRandInt(100);
	}

	private static String getAdressStreet() {
		return GenerateVariables.getRandString(10);
	}

	private static String getAdressCity() {
		return GenerateVariables.getRandString(10);
	}

	@SuppressWarnings("static-access")
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}
}
