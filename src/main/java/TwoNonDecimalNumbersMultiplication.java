package com.qualizeal.javaapp04.operation;

public class TwoNonDecimalNumbersMultiplication {
	public long multiply(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			return -2;
		}
		if(num1 < 0 || num2 < 0) {
			return -1;
		}
		long result;
		result = num1 * num2;
		return result;
	}
}