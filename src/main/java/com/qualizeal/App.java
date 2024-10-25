package com.qualizeal.javaapp04;

import com.qualizeal.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
		long result1 = twoNonDecimalNumbersMultiplication.multiply(20,10);
		System.out.println(result1);
	}
}