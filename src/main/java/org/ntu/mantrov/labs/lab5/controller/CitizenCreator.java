package org.ntu.mantrov.labs.lab5.controller;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.GenerateVariables;
import org.ntu.mantrov.labs.lab5.Main;
import org.ntu.mantrov.labs.lab5.Manager;
import org.ntu.mantrov.labs.lab5.model.Adress;
import org.ntu.mantrov.labs.lab5.model.Citizen;
import org.ntu.mantrov.labs.lab5.model.Sex;

public class CitizenCreator {
	private static Scanner scanner = new Scanner(System.in);
	
	public CitizenCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public static Citizen createCitizen() {
		Citizen citizen = new Citizen(getCitizenName(), getCitizenAge(), getCitizenSex(), getCitizenAdress());
		return citizen;
	}

	private static Adress getCitizenAdress() {
		Manager.printAdressList(Main.adressList);
		System.out.print("Select adress of list: ");
		int select = scanner.nextInt()-1;
		return Main.adressList.get(select);
	}

	private static Sex getCitizenSex() {
		System.out.print("Sex selection:\n1 - Male\n2 - Female\nEnter your sex: ");
		int select = scanner.nextInt();
		if (select == 1) {
			return Sex.MALE;
		} else if (select == 2) {
			return Sex.FEMALE;
		}
		return null;
	}

	private static int getCitizenAge() {
		return GenerateVariables.getRandInt(100);
	}

	private static String getCitizenName() {
		return GenerateVariables.getRandString(8);
	}

	@SuppressWarnings("static-access")
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}
}
