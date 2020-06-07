package com.sapient.java;

public class Test {
	
	public static void main(String args[]) 
    { 
		
		Num_Process[] opr = new Num_Process[3];
			
		opr[0] = (int x, int y)->(x+y); 
		opr[1] = (int x, int y)->(x*y);
		opr[2] = (int x, int y)->(x/y);
		int a,b,n;
		
		System.out.println("Enter 2 number:");
		a = Read.read().nextInt();
		b = Read.read().nextInt();
		
		System.out.println("Select operation:\n1:Addition\n2:Multiplication\n3:Division");
		n = Read.read().nextInt();
        
		System.out.println(opr[n-1].cal(a,b));
		
    } 

}
