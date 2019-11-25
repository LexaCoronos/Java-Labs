package org.ntu.mantrov.labs.lab5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.ntu.mantrov.labs.lab5.model.Adress;
import org.ntu.mantrov.labs.lab5.model.Sex;

public class Main {

	public static void main(String[] args) {
		
		// System.out.println(sex.getRu());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first symbol: ");
		char firstSymbol = scanner.next().charAt(0);
		
		Class<Adress> adress = Adress.class;
		List<String> streets = streets.stream().map(adress -> adress.getStreet()).filter(it -> it.charAt(0) == firstSymbol).collect(Collectors.toList());
		
	}
}
