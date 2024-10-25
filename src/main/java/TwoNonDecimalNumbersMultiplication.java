package com.qualizeal.javaapp04.operation;
public class TwoNonDecimalNumbersMultiplication {
	public long multiply(int number1,int number2) {
		if (number1 <0 || number2 < 0){
			return -1;
		} else if(number1 == 0 || number2 ==0){
			return -2;
		}
		else{
			return (long)(number1 * number2);
		}
	}
}