package com.sapient.java;

import java.util.Arrays;

public class Int_Arr_Process {
	
	int[] arr;
	
	public Int_Arr_Process()
	{
		arr = new int[10];
	}
	
	public Int_Arr_Process(int size)
	{
		arr = new int[size];
	}
	
	public Int_Arr_Process(int[] arr)
	{
		//this.arr = new int[arr.length];
		this.arr = arr;
	}
	
	public Int_Arr_Process(Int_Arr_Process obj)
	{	
		this.arr = obj.arr;
	}
	
	public void read()
	{		
		System.out.println("Enter "+  arr.length + " Integers");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = Read.read().nextInt();
		}
	}
	
	public void displayHorizontal()
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");		
		}
	}	
	
	public void displayVertical()
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");		
		}
		
		System.out.println();
	}
	
	public void sort()
	{
		Arrays.sort(arr);
	}
	
	public int sum() {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;	
	}
	
	public int Max() {
		
		int max	= 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(max<arr[i])
				max= arr[i];
		}
		
		return max;
	}
	
public int Min() {
		
		int min	= 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(min>arr[i])
				min = arr[i];
		}
		
		return min;
	}

public int secondMax() {
	
	int max1=arr[0], max2=arr[0];
	
	for (int i = 0; i < arr.length; i++) {
		
		if(max1<=arr[i]) {
			
			max2=max1;
			max1=arr[i];
		}
			
	}
	
	return max2;
}

	
	public static void main(String[] args) {
		
		Int_Arr_Process array = new Int_Arr_Process();
		array.read();
		array.displayHorizontal();
		array.displayVertical();
		
		Int_Arr_Process array2 = new Int_Arr_Process(7);
		array2.read();
		array2.sort();
		
		Int_Arr_Process array3 = new Int_Arr_Process(array2);
		array3.displayHorizontal();
		
		int[] arr = {11,2,13,4,0};
		Int_Arr_Process array4 = new Int_Arr_Process(arr);
		System.out.println(array4.sum());
		System.out.println(array4.Max());
		System.out.println(array4.Min());
		System.out.println(array4.secondMax());		
	}
}
