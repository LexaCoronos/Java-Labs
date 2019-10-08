package org.ntu.mantrov.labs.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = MatrixCalculator.inputWith(s);
		int m = MatrixCalculator.inputHeight(s, n);

		int[][] matrix = new int[n][m];
		
		MatrixCalculator.selectMenu(matrix, s);

		MatrixCalculator.printMatrix(matrix);
		System.out.println("Maximum Element is: " + MatrixCalculator.calculateMaximumElement(matrix));
		System.out.println("Minimum Element is: " + MatrixCalculator.calculateMinimumElement(matrix));
		System.out.println("Sum Element matrix A is: " + MatrixCalculator.sumElement(matrix));
	}
}
