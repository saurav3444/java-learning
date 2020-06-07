package com.sapient.Numbers;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		  Scanner sc = new Scanner(System.in);
		 
		  int n[]  = new int[args.length];
		  
		  int i =0;
		  for(String str: args)
		  {
			  n[i]  = Integer.parseInt(str);
			  i++;
		  }
		
		  Command_Line1 cmd = new Command_Line1(); 
		  cmd.setN(n);
		  
		  System.out.println("Elements are: "); 
		  cmd.display();
		  
		  System.out.println("Sum of Elements: "+ cmd.sum());
		  System.out.println("Average of Elements: "+ cmd.average(cmd.sum()));
		  System.out.println("Max of Elements: "+ cmd.Max());
		  System.out.println("Min of Elements: "+ cmd.Min());
		  
			
		  System.out.println("\n\nEnter no. of Elements:");
			  
		  int no = sc.nextInt(); System.out.println("Enter " + no +" Elements");
		  KeyRead_Line2 Kread = new KeyRead_Line2(no);
			  
		  Kread.read(no); Kread.find(); Kread.sort();
			 
		  
		  System.out.println("\n\nEnter a number:");
		  String str = sc.next();
		  Fig_to_Words.figToWords(str);
		 
	}
}
