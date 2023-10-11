package pack1;
// ASSIGNMENT 2 ((((10+2)+2)-2)*2)/2)
public class Assignment2 {  // Pillar2 
	
	public int sum(int a, int b) 
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
		Assignment2 A2= new Assignment2();
		int R1 = A2.sum(10,2);
		int R2 = A2.sum(R1,2);
		int R3 = A2.sub(R2, 2);
		int R4 = A2.multiply(R3, 2);
		int R5 = A2.divide(R4,2);
		System.out.println("Final Result is :" +R5);
	}

}
