package org.ntu.mantrov.labs.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ntu.mantrov.labs.lab5.model.Adress;
import org.ntu.mantrov.labs.lab5.model.Citizen;

public class Main {

	public static List<Adress> adressList = new ArrayList<>();
	public static List<Citizen> citizenList = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		adressList = Manager.setAdressList(scanner);
		Manager.printAdressList(adressList);
		citizenList = Manager.setCitizenList(scanner);
		Manager.printCitizenList(citizenList);
		
		Manager.printStreetListOnFirstSymbol(adressList, scanner);
	}
}
