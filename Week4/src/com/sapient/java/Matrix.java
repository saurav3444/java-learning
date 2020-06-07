
package com.sapient.java;


public class Matrix {
	
	private int row, col;
	private int[][] mat;
	
	public Matrix()
	{
		row = col = 3;
		mat = new int[row][col];
	}
	
	public Matrix(int row, int col)
	{
		this.row = row;
		this.col = col;
		mat = new int[row][col];
	}
	
	public Matrix(int[][] mat1, int r, int c)
	{
		row = r; col = c;
		mat = new int[r][c];
		
		for (int i = 0; i < row; i++) { 
			for (int j = 0; j < col; j++) {
				mat[i][j]=mat1[i][j];	
			}
		}
	}
	
	public Matrix(Matrix obj)
	{	
		row = obj.row;
		col = obj.col;
		this.mat = obj.mat;
	}
	
	public void read()
	{		
		System.out.println("Enter "+  col*row + " Integers");
		
		for (int i = 0; i <row ; i++)
			for (int j = 0; j <col; j++) 
				mat[i][j] = Read.read().nextInt();
	}
	
	public void display()
	{
		for (int i = 0; i < row; i++) { 
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println();

	}	
	
	
	public int[][] Add(int[][] mat1, int r, int c) {
		// TODO Auto-generated method stub
		
		if(row!=r || col!=c )
			System.out.println("Addition Not Possible");
		
		else {
			System.out.println("Addition\n");
			
			for (int i = 0; i < row; i++) { 
				for (int j = 0; j < col; j++) {
					mat1[i][j]+=mat[i][j];	
				}
			}
		}
		
		return mat1;
	}
	
	public int[][] Multiply(int[][] mat1, int r, int c) {
		// TODO Auto-generated method stub
		
		if(col!=r )
			System.out.println("Multiplication is Not Possible");
		
		else {
			
			System.out.println("Multiplication\n");

			int[][] mat3 = new int[row][c];
			
			for (int i = 0; i < row; i++) 
				for (int j = 0; j < c; j++)  
					mat3[i][j]= 0;
			
			for (int i = 0; i < row; i++) { 
				for (int j = 0; j < c; j++) {
					for (int k = 0; k < col; k++)  {
						
						mat3[i][j]+= mat[i][k]*mat1[k][j];
					}
				}
			}
			
			return mat3;
		}
		
		return mat1;
	}
	
	public boolean Scaler() {
		
		if(row!=col)
			return false;
		
		int id = mat[0][0];
		System.out.println("Scaler:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				if(i==j && mat[i][j]!=id)
					return false;
				
				if(i!=j && mat[i][j]!= 0)
					return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Matrix matrix = new Matrix();
		
		matrix.read();
		matrix.display();
		System.out.println(matrix.Scaler());
		
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int mat1[][] = matrix.Add(mat, 3, 3);
		Matrix matrix1 = new  Matrix(mat1,3,3);
		matrix1.display();
		
		
		Matrix matrix2 = new Matrix(matrix1); 
		int mat2[][] = matrix2.Multiply(mat, 3,3);
		  
		Matrix matrix3 = new Matrix(mat2,3,3); 
		matrix3.display();
		 		
	}

}
