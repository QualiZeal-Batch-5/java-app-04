package com.qualizeal;
import com.qualizeal.javaapp04.operation.TwoNonDecimalNumbersMultiplication;
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
		long result1 = twoNonDecimalNumbersMultiplication.multiply(10,3);
		System.out.println(result1);
		long result2 = twoNonDecimalNumbersMultiplication.multiply(10,4);
		System.out.println(result2);
	}
}
