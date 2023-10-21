package pack1;

import java.util.Scanner;

public class input {
	
	public int addition(int a, int b)
	{
			int c;
			c=a+b;
			System.out.println("Sum of two numbers is " +c);
			return c;
	}
	public int sub(int x, int y) 
	{
		int z;
		z=x-y;
		System.out.println("Subtract of two numbers is " +z);
		return z;

	}
	
	public int multiply(int m1, int m2) 
	{
		int m3;
		m3=m1*m2;
		System.out.println("Multiplication of two numbers is " +m3);
		return m3;

	}
	public int divide(int d1, int d2) 
	{
		int d3;
		d3=d1/d2;
		System.out.println("Division of two numbers is " +d3);
		return d3;

	}

	public static void main(String[] args) {
		System.out.println("Enter the value of x1,x2,x3,x4,x5,x6");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		
		//Assignment 1 (((((x1+x2)+x3)-x4)*x5)/x6)
		input obj=new input();
		int R1= obj.addition(x1, x2);
		int R2=obj.addition(R1, x3);
		int R3=obj.sub(R2, x4);
		int R4=obj.multiply(R3, x5);
		int R5=obj.divide(R4, x6);
		
		System.out.println("Final Result of Assignment1 (((((x1+x2)+x3)-x4)*x5)/x6) is :" +R5 +"\n");
		
		//Assignment 2 (((((x1*x2)-x3)+x4)-x5)/x6)
		int P1=obj.multiply(x1, x2);
		int P2=obj.sub(P1, x3);
		int P3=obj.addition(P2,x4);
		int P4=obj.sub(P3, x5);
		int P5=obj.divide(P4, x6);
		
		System.out.println("Final Result of Assignment2 (((((x1*x2)-x3)+x4)-x5)/x6) is :" +P5);
		
		
	
	}

}
