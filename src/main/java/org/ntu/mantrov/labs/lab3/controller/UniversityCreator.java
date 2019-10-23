package org.ntu.mantrov.labs.lab3.controller;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.Var;
import org.ntu.mantrov.labs.lab3.model.Faculty;
import org.ntu.mantrov.labs.lab3.model.University;

public class UniversityCreator {
	private Scanner scanner;
	
	public UniversityCreator(Scanner scanner) {
		this.setScanner(scanner);
	}
	
	public University createUnivesity() {
		University university = new University(getUniversityName(), getUniversityIndex(), getUniversityFacultys());
		return university;
	}
	
	private String getUniversityName() {
		//System.out.println("Input university name: ");
		//return scanner.next();
		return Var.getRandString(5);
	}
	
	private int getUniversityIndex() {
//		System.out.println("Input university index: ");
//		return scanner.nextInt();
		return Var.getRandInt(20);
	}
	
	private Faculty[] getUniversityFacultys() {
		System.out.println("Input university Facultys count: ");
		int count = scanner.nextInt();
		Faculty[] facultys = new Faculty[count];
		FacultyCreator facultyCreator = new FacultyCreator(scanner);
		for (int i = 0; i < count; i++) {
			facultys[i] = facultyCreator.createFaculty();
		}
		return facultys;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}
	
}
