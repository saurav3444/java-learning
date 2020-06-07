package com.sapient.Numbers;

import java.util.Arrays;

public class Command_Line1 {

	int[] n;
	
	public int[] getN() {
		return n;
	}

	public void setN(int[] n) {
		this.n = n;
	}
	
	public void display()
	{
		System.out.println(Arrays.toString(n));
	}
	
	public int sum()
	{
		int sum=0;
		for(int i=0;i<n.length;i++)
			sum+=n[i];
		
		return sum;
	}
	
	public double average(int sum)
	{
		return (double)sum/(double)n.length;
	}
	
	public int Max()
	{
		int max=n[0];
		for(int i=0;i<n.length;i++)
			if(max<n[i])
				max=n[i];
		return max;
	}

	public int Min()
	{
		int min=n[0];
		for(int i=0;i<n.length;i++)
			if(min>n[i])
				min=n[i];
		return min;
	}

	
}
