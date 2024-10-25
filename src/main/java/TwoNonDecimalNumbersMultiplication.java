package com.qualizeal.javaapp04.operation;

public class TwoNonDecimalNumbersMultiplication {
	int res = 0;
	public long multiply(int a, int b) {
		if(a < 0 || b < 0) {
			res = -1;
		} else if(a == 0 || b == 0) {
			res = -2;
		} 
		else{
		res = a * b ;
	}
	return res;
}
}
		