package com.qualizeal.javaapp04;
 
import com.qualizeal.javaapp04.operation.TwoNonDecimalNumbersMultiplication;
 
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersMultiplication twoNonDecimalnumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
		long result = twoNonDecimalnumbersMultiplication.multiply(20,10);
		System.out.println(result);
	}
}