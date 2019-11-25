package org.ntu.mantrov.labs.lab3.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.Var;
import org.ntu.mantrov.labs.lab3.model.Department;
import org.ntu.mantrov.labs.lab3.model.Group;

public class DepartmentCreator {
	private Scanner scanner;

	public DepartmentCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public Department createDepartment() {
		Department department = new Department(getDepartmentName(), getDepartmentIndex(), getDepartmentGroups());
		return department;
	}

	private int getDepartmentIndex() {
//		System.out.println("Input Department index: ");
//		return scanner.nextInt();
		return Var.getRandInt(20);
	}

	private String getDepartmentName() {
//		System.out.println("Input Department name: ");
//		return scanner.next();
		return Var.getRandString(5);
	}

	private List<Group> getDepartmentGroups() {
		System.out.println("Input Department Groups count: ");
		int count = scanner.nextInt();
		List<Group> groups = new ArrayList<>();
		GroupCreator groupsCreator = new GroupCreator(scanner);
		for (int i = 0; i < count; i++) {
			groups.add(groupsCreator.createGroup());
		}
		return groups;
	}
	
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}

}
