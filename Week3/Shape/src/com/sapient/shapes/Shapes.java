package com.sapient.shapes;

public class Shapes {

	public int noOfSides;
	
	public double calculateShapeArea(int noOfSides, int side) {
		
		if(noOfSides==1)
		{
			Circle circle = new Circle();
			
			return circle.calculateArea(side);
		}
		
		if(noOfSides==3)
		{
			Triangle traingle = new Triangle();
			
			return traingle.calculateArea(side);
		}
		
		if(noOfSides==4)
		{
			Square square = new Square();
			
			return square.calculateArea(side);
		}
		
		else
		{
			System.out.println("No shape exists");
			return 0;
		}
		
	}
	

	public static void main(String args[])
	{
		Shapes shapes = new Shapes();
		double ans;
		ans = shapes.calculateShapeArea(1, 2);
		System.out.println(ans);
		
		ans = shapes.calculateShapeArea(3, 2);
		System.out.println(ans);
		
		ans = shapes.calculateShapeArea(4, 2);
		System.out.println(ans);
		
		ans = shapes.calculateShapeArea(5, 2);
		System.out.println(ans);
		
		
	}
	
	
	
}
