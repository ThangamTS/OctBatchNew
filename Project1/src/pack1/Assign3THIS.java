package pack1;

//ASSIGNMENT FOR THIS KEYWORD

public class Assign3THIS {  //Pillar 1 - class creation
	
	public Assign3THIS() //CONSTRUCTOR
	{
		this(12,13,14);
		System.out.println("Default/VOID constructor");
		
	}
	public Assign3THIS(int a) //CONSTRUCTOR
	{
		this();
		System.out.println("Single Parameterized constructor");
		
	}
	
	public Assign3THIS(int a, int b) //CONSTRUCTOR
	{
		this(1,2,3,4);
		System.out.println("Two Parameterized constructor");
		
	}
	
	public Assign3THIS(int a, int b,int c) //CONSTRUCTOR
	{

		System.out.println("Three Parameterized constructor");
		
	}
	
	public Assign3THIS(int a, int b, int c, int d) //CONSTRUCTOR
	{
		this(11);
		System.out.println("Four Parameterized constructor");
		
	}
	public static void main(String[] args) {  //Pillar2 Main Method
		
		Assign3THIS abc= new Assign3THIS(12, 144);
		

	}

}
