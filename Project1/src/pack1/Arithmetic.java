package pack1;

public class Arithmetic {  // Pillar1
	
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
	
	public void multi(int a1, int a2) 
	{
		int a3;
		a3=a1*a2;
		System.out.println("The Final result is " + a3);
	
	}
	public static void main(String[] args) { // Pillar 2
		
		Arithmetic ob= new Arithmetic();  // Pillar 3
		int sum1result= ob.sum(12 ,12);  // Pillar 4
		int sub1result= ob.sub(10 ,1);
		ob.multi(sum1result, sub1result);
		
	}

}
