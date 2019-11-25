package org.ntu.mantrov.labs.lab3;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.controller.UniversityCreator;
import org.ntu.mantrov.labs.lab3.model.*;


public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		UniversityCreator universityCreator = new UniversityCreator(new Scanner(System.in));
		University university = universityCreator.createUnivesity();
		System.out.println(university.toString());
		GsonManager.saveToJson(university);
		GsonManager.getFromJson();
	}

}
