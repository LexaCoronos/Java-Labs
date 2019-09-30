package org.ntu.mantrov.labs.lab1;

import java.util.Random;
import java.util.Scanner;

public class Methods {

	public static int inputWith(Scanner s) {
		System.out.println("Enter number rows matrix A: ");
		return Integer.parseInt(s.next());
	}

	public static int inputHeight(Scanner s, int n) {
		int m = 0;
		System.out.println("Inter number columns matrix A: ");
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

	public static int[][] setMatrixRandomNumber(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				Random r = new Random();
				matrix[i][j] = r.nextInt(Main.UPPER_BOARD_OF_RANGE);
			}
		}
		return matrix;
	}
	
	public static int[][] setMatrixUseKeyboard(int[][] matrix, Scanner s) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				do {
					System.out.println("Inter element A[" + i + "][" + j
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

	public static void calculateMaximumElement(int[][] matrix) {
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		System.out.println("Maximum Element is: " + max);
		return;
	}

	public static void calculateMinimumElement(int[][] matrix) {
		int min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
		}
		System.out.println("Minimum Element is: " + min);
		return;
	}

	public static void sumElement(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		System.out.println("Sum Element matrix A is: " + sum);
		return;
	}

}
