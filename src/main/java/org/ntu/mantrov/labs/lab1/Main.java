package org.ntu.mantrov.labs.lab1;

import java.util.Scanner;

public class Main {
	public final static int UPPER_BOARD_OF_RANGE = 100;

	public static void main(String[] args) {
		//sda

		Scanner s = new Scanner(System.in);
		int n = Methods.inputWith(s); // rows
		int m = Methods.inputHeight(s, n); // columns

		int[][] matrix = new int[n][m];
		
		boolean errorEnter = false;
		do {
			System.out
					.println("Matrix Fill Method: \n1 - Random numbers \n2 - Use Keyboard");
			int method = Integer.parseInt(s.next());

			switch (method) {
			case 1:
				matrix = Methods.setMatrixRandomNumber(matrix);
				break;
			case 2:
				matrix = Methods.setMatrixUseKeyboard(matrix, s);
				break;
			default:
				errorEnter = true;
			}
			if (errorEnter == false) {
				break;
			}
			errorEnter = false;
			System.out.println("Repeat the menu item selection");
		} while (true);

		Methods.printMatrix(matrix);
		Methods.calculateMaximumElement(matrix);
		Methods.calculateMinimumElement(matrix);
		Methods.sumElement(matrix);
	}
}
