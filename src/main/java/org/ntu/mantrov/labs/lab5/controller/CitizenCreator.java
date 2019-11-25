package org.ntu.mantrov.labs.lab5.controller;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.Var;
import org.ntu.mantrov.labs.lab5.model.Adress;
import org.ntu.mantrov.labs.lab5.model.Citizen;
import org.ntu.mantrov.labs.lab5.model.Sex;

public class CitizenCreator {
	private static Scanner scanner;
	
	public CitizenCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public static Citizen createUnivesity() {
		Citizen citizen = new Citizen(getCitizenName(), getCitizenAge(), getCitizenSex(), getCitizenAdress());
		return citizen;
	}
	
	private static Adress getCitizenAdress() {
		return null;
	}

	private static Sex getCitizenSex() {
		return null;
	}

	private static int getCitizenAge() {
		return Var.getRandInt(100);
	}

	private static String getCitizenName() {
		return Var.getRandString(8);
	}

	@SuppressWarnings("static-access")
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}
}
