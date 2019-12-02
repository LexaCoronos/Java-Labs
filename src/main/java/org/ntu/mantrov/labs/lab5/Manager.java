package org.ntu.mantrov.labs.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.ntu.mantrov.labs.lab5.controller.AdressCreator;
import org.ntu.mantrov.labs.lab5.controller.CitizenCreator;
import org.ntu.mantrov.labs.lab5.model.Adress;
import org.ntu.mantrov.labs.lab5.model.Citizen;

public class Manager {
	
	public static List<Adress> setAdressList(Scanner scanner) {
		System.out.print("Enter count adress to create: ");
		int countAdress = scanner.nextInt();
		
		List<Adress> adressList = new ArrayList<>();
		for (int i = 0; i < countAdress; i++) {
			adressList.add(AdressCreator.createAdress());
		}
		return adressList;
	}
	
	public static void printAdressList(List<Adress> adressList) {
		System.out.println("Adress List");
		for (Adress adress : adressList) {
			System.out.println("• " + adress.toString());
		}
	}
	
	public static List<Citizen> setCitizenList(Scanner scanner) {
		System.out.print("Enter count citizen to create: ");
		int countCitizens = scanner.nextInt();
		
		List<Citizen> citizenList = new ArrayList<>();
		for (int i = 0; i < countCitizens; i++) {
			citizenList.add(CitizenCreator.createCitizen());
		}
		return citizenList;
	}
	
	public static void printCitizenList(List<Citizen> citizenList) {
		System.out.println("Citizen List");
		for (Citizen citizen : citizenList) {
			System.out.println("• " + citizen.toString());
		}
	}
	
	public static void printStreetListOnFirstSymbol(List<Adress> adressList, Scanner scanner) {
		System.out.print("Enter first symbol: ");
		char firstSymbol = scanner.next().charAt(0);
		adressList.stream()
				.map(adress -> adress.getStreet())
				.filter(it -> it.charAt(0) == firstSymbol)
				.forEach(it -> System.out.println("Street: " + it));
		
		adressList.stream()
		.filter(adress -> adress.getStreet().charAt(0) == firstSymbol)
		.map(Adress :: getStreet)
		.forEach(it -> System.out.println("Street: " + it));
				//.collect(Collectors.toList());
		
		//System.out.println(streetList.toString());
	}
}
