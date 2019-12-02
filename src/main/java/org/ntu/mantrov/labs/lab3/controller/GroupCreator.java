package org.ntu.mantrov.labs.lab3.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.GenerateVariables;
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
		return GenerateVariables.getRandInt(20);
	}

	private String getGroupName() {
//		System.out.println("Input Group name: ");
//		return scanner.next();
		return GenerateVariables.getRandString(5);
	}

	private List<Student> getGroupStudents() {
		System.out.println("Input Group Students count: ");
		int count = scanner.nextInt();
		List<Student> students = new ArrayList<>();
		StudentCreator studentsCreator = new StudentCreator(scanner);
		for (int i = 0; i < count; i++) {
			students.add(studentsCreator.createStudent());
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
