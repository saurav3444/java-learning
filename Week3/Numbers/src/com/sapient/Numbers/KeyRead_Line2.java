package com.sapient.Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	
	int[] arr;
	
	KeyRead_Line2(int n)
	{
		arr = new int[n];
	}
	
	public void read(int n)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	}

	public void display() {
		// TODO Auto-generated method stub
	
		 System.out.println(Arrays.toString(arr));
	}

	public void find() {
		// TODO Auto-generated method stub
		System.out.println("Enter no. to searched");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k  = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i])			{
				System.out.println("Element is present at index " + i);
				return;
			};
		}
		System.out.println("Element is not present ");

	}

	public void sort() {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		System.out.println("Sorted array");
		display();
	}
	

}
