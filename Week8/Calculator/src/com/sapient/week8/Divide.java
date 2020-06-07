package com.sapient.week8;

public class Divide implements Calculator {

	@Override
	public int calculate(int a, int b) {
		
		if(b!=0)
			return (a/b);
		
		return -1;
	}

}
