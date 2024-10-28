package com.qualizeal;

import com.qualizeal.javaapp03.operation.TwoNonDecimalNumbersSubtraction;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
		int fres = twoNonDecimalNumbersSubtraction.subtract(10,3);
		System.out.println(fres);
		
	}
}