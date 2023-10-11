package pack1;


public class Testclass1 //Pillar 1 - class creation
{
	int a;
	
	public void Thangam() // method name uses ()
	{
		System.out.println("First Assignment ");
	
	}

	// pillar 2 - Main Method Creation
	public static void main(String[] args) {
		
		Testclass1 abc= new Testclass1(); // pillar 3 
		abc.Thangam() ;	
		abc.Thangam();
		abc.a=123;
		System.out.println(abc.a);
		

	}

}
