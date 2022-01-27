//Example.java
abstract class Ex implements  I
{
	//Assume this class developer knows only the implementation of m1() method
	//Hence in Example only m1() method is implemeted and m2() is implemeted by next sub class of Example.
	//Hence Example should be declared as abstract
	/*
	Rule: inteface methods are public, hence method overriding method should contain  public access specifier 
				Voilation leads to compile time error

	CE: m1() in Ex cannot implement m1() in I; attempting to assign weaker access privileges; was public
	//wrong implementaion
	void m1()
	{
		 System.out.println("m1 in Example");
	}

	*/
	//correct implementation
	public void m1()
	{
		 System.out.println("m1 in Example");
	}
}