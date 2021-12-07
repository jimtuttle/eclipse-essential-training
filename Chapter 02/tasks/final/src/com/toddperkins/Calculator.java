package com.toddperkins;

public class Calculator {
	
	public Calculator() {
		//TODO Write tests
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public double divide(double num1, double num2) {
		return num2 == 0 ? 0 : num1 / num2;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.subtract(3, 4));
		System.out.println(calculator.multiply(5, 6));
		System.out.println(calculator.divide(7, 8));
	}

}
