package com.qualizeal.javaapp04.operation;
public class TwoNonDecimalNumbersMultiplication {
	int result = 1;
	public long multiply(int num1,int num2) {
		if(num1 < 0 || num2 < 0) {
			result = -1;
		}
		else if(num1==0 || num2==0) {
			result = -2;
		}
		else{
			result = num1 * num2;
		}
		return result;
	}
}