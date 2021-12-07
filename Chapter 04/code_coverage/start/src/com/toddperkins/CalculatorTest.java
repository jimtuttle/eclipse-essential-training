package com.toddperkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private final Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}

}
