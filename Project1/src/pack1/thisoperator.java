package pack1;

public class thisoperator {
	
	int abc=11;   //global variable
	public void m1(int a)  //the scope of the local variable
	{
		abc=a;
		
		//this.variable will help to assign the value of local variable to global variable
		
	}

	public static void main(String[] args) {
		thisoperator obj=new thisoperator();
		System.out.println(obj.abc);
		obj.m1(122);
		

	}

}
