package org.ntu.mantrov.labs.lab1;

import java.util.Random;
import java.util.Scanner;

public class MatrixCalculator {
	public final static int UPPER_BOARD_OF_RANGE = 100;
	
	public static int inputWith(Scanner s) {
		System.out.println("Enter number of rows matrix A: ");
		return Integer.parseInt(s.next());
	}

	public static int inputHeight(Scanner s, int n) {
		int m = 0;
		System.out.println("Enter number of columns matrix A: ");
		do {
			m = Integer.parseInt(s.next());
			if (n != m) {
				break;
			}
			System.out.println("Error: rows = columns! Repeat Entry");

		} while (true);
		return m;
	}

	public static void printMatrix(int[][] matrix) {

		System.out.println("Your matrix A is:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] setMatrixRandomNumbers(int[][] matrix, int matrixMaxRangeNumber) {
		Random r = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = r.nextInt(matrixMaxRangeNumber);
			}
		}
		return matrix;
	}
	
	public static int[][] setMatrixUseKeyboard(int[][] matrix, Scanner s) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				do {
					System.out.println("Enter element A[" + i + "][" + j
							+ "] = ");
					try {
						matrix[i][j] = Integer.parseInt(s.next());
						break;
					} catch (Exception e) {
						System.out.println("Only numbers!");
					}
				} while (true);
			}
		}
		return matrix;
	}

	public static int calculateMaximumElement(int[][] matrix) {
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	public static int calculateMinimumElement(int[][] matrix) {
		int min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	public static int sumElement(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static void selectMenu(int[][] matrix, Scanner s) {
		boolean errorEnter;
		do {
			errorEnter = false;
			System.out
					.println("Matrix Fill Method: \n1 - Random numbers \n2 - Use Keyboard");
			int method = Integer.parseInt(s.next());

			switch (method) {
			case 1:
				matrix = MatrixCalculator.setMatrixRandomNumbers(matrix, MatrixCalculator.UPPER_BOARD_OF_RANGE);
				break;
			case 2:
				matrix = MatrixCalculator.setMatrixUseKeyboard(matrix, s);
				break;
			default:
				errorEnter = true;
			}
			if (errorEnter == false) {
				break;
			}
			System.out.println("Repeat the menu item selection");
		} while (true);
		
	}

}
