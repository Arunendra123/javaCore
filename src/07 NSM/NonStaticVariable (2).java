/*
	- Below program shows 
		- creating non-static variables
		- providing memory location
		- accessing them from main method (static method)
		- reinitializing them
		- using them in an expression

- can this program as NonStaticVariables.java
*/
class NonStaticVariable 
{
	int x = 10;
	int y = 20;
	
	public static void main(String[] args) 
	{

		//System.out.println(x);  CE: non-static variable x cannot be reference from static context
		//System.out.println(y);  CE: CE: non-static variable y cannot be reference from static context
		
		//object creation statement, to provide memory location for nonstatic variables, and to access them from main		
		NonStaticVariable nsv = new NonStaticVariable();

		//accessing non-static variables using object name nsv
		System.out.println(nsv.x); //10
		System.out.println(nsv.y); //20

		//re-initialization 
		nsv.x = 50;	
		nsv.y = 60;
		
		System.out.println();

		System.out.println(nsv.x);	//50
		System.out.println(nsv.y);  //60
		
		//using nsvs in an expression
		nsv.x = nsv.x + 10;
		nsv.y = nsv.y + 10;
		
		System.out.println();

		System.out.println(nsv.x); //60
		System.out.println(nsv.y); //70

	}
}
