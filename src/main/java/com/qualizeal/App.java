package com.qualizeal;

import com.qualizeal.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App {
	public static void main(String[] args) {
		
		TwoNonDecimalNumbersMultiplication TwoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
		long result = TwoNonDecimalNumbersMultiplication.multiply(10,2); 
		System.out.println(result);
		
	}
}


