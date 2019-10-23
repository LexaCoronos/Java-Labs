package org.ntu.mantrov.labs.lab3.controller;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.Var;
import org.ntu.mantrov.labs.lab3.model.Group;
import org.ntu.mantrov.labs.lab3.model.Student;

public class GroupCreator {
	private Scanner scanner;

	public GroupCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public Group createGroup() {
		Group group = new Group(getGroupName(), getGroupIndex(), getGroupStudents());
		return group;
	}

	private int getGroupIndex() {
//		System.out.println("Input Group index: ");
//		return scanner.nextInt();
		return Var.getRandInt(20);
	}

	private String getGroupName() {
//		System.out.println("Input Group name: ");
//		return scanner.next();
		return Var.getRandString(5);
	}

	private Student[] getGroupStudents() {
		System.out.println("Input Group Students count: ");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		StudentCreator studentsCreator = new StudentCreator(scanner);
		for (int i = 0; i < count; i++) {
			students[i] = studentsCreator.createStudent();
		}
		return students;
	}
	
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}

}
