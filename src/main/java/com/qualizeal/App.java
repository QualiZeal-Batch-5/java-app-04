package com.qualizeal.javaapp04;
import com.qualizeal.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App {
	public static void main(String[] args) {
       TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
       long result1 =  twoNonDecimalNumbersMultiplication.multiply(200,10);
       System.out.println(result1);
       long result2 =  twoNonDecimalNumbersMultiplication.multiply(10,-3);
       System.out.println(result2);
       long result3 =  twoNonDecimalNumbersMultiplication.multiply(2,0);
       System.out.println(result3);



	}
}