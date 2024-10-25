package com.qualizeal;

import com.qualizeal.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class MainProgram {
	
	public static void main(String[] args){
		
		TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
		long result = twoNonDecimalNumbersMultiplication.multiply(10,2);
		
		System.out.println(result);
	}
}