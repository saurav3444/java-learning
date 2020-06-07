package com.sapient.week8;


public class CalculatorRunner {
	public static void main(String[] args) {
		Calculator calc= new Divide();
		int result = calc.calculate(4,2);
		System.out.println(result);
	}
}
