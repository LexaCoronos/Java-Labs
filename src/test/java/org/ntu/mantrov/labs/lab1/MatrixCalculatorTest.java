package org.ntu.mantrov.labs.lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixCalculatorTest {

	@Test
	public void testCalculateMaximumElement() {
		assertEquals(10, MatrixCalculator.calculateMaximumElement(getMatrix()));
	}

	private int[][] getMatrix() {
		int[][] matrix = {{2,10},{3,4}};
		return matrix;
	}

	@Test
	public void testCalculateMinimumElement() {
		assertEquals(2, MatrixCalculator.calculateMinimumElement(getMatrix()));
	}

	@Test
	public void testSumElement() {
		assertEquals(19, MatrixCalculator.sumElement(getMatrix()));
	}

}
