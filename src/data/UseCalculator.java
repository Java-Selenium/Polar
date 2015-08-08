package data;

import junit.framework.Assert;

public class UseCalculator {

	public static void main(String[] args) {


		int actual = 40;
		Calculator calculate = new Calculator();
		int expected = calculate.addition(20, 20);
		System.out.println("addition : " + expected);
		Assert.assertEquals(expected, actual);
		
		int multiplyResult = calculate.multiplication(4, 10);
		System.out.println("Multiplication : " + expected);
		Assert.assertEquals(multiplyResult, actual);
		
		
		

	}

}
