package com.toddperkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private final Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}

	@Test
	void testSubtract() {
		assertEquals(17, calculator.subtract(25, 8));
	}

	@Test
	void testMultiply() {
		assertEquals(25, calculator.multiply(5, 5));
	}

	@Test
	void testDivide() {
		assertEquals(5, calculator.divide(10, 2));
		assertEquals(0, calculator.divide(10, 0));
	}

}
