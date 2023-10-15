package pack1;

public class Assign4THIS {   // Pillar1
	
	public void Methoddefault()
	{
		System.out.println("Default Method");
		
	}
	
	public void Method1()
	{
		System.out.println("One Parameterized Method");
		
	}
	
	public void Method2()
	{
		this.Method3();
		this.Methoddefault();
		this.Method1();
		this.Method4();
		System.out.println("Two Parameterized Method");
		
	}
	
	public void Method3()
	{
		System.out.println("Three Parameterized Method");
		
	}

	public void Method4()
	{
		System.out.println("Four Parameterized Method");
		
	}
	
	public static void main(String[] args) {
		Assign4THIS v= new Assign4THIS();
		v.Method2();

	}

}
