package com.sapient.number;

public class Numbers {

	int checkPrime(int num) {
		
		for(int i=2;i<=Math.pow(num, 0.5);i++) {
			
			if(num%i==0) {
				
				return 0;
			}
		}
		
		return 1;
	}
	
	boolean checkArmstrong(int n) {
		
		int sum = 0, temp = n;
		
		while(temp!=0) {
			
			sum += Math.pow(temp%10, 3);
			temp /= 10;
		}
		
		if(sum==n) return true;
		
		return false;
	}
	
	boolean checkPalindrome(int n) {
		
		String temp =  String.valueOf(n);
		
		for(int i= 0; i<temp.length()/2;i++) {
			
			if(temp.charAt(i)!=temp.charAt(temp.length()-i-1))
				return false;
	
		}
		
		return true;
	}
}


