package com.qualizeal.javaapp03.operation;

public class TwoNonDecimalNumbersSubtraction {
	public int subtract(int num1, int num2) {
		if (num1<0 || num2<0) {
			return -1;
		}
		
		else if (num1==0 ||num2==0) {
			return -2;
		}
		
		else {
			int result = num1 - num2;
			return result;
		}
		
	}

}
