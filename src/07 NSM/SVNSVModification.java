class SVNSVModification 
{
	static int a = 10;
	static int b = 20;

	int x = 30;
	int y = 40;

	public static void main(String[] args) 
	{
		//accessing directly by name
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		//accessing with classname
		System.out.println("SVNSVModification.a: "+SVNSVModification.a);
		System.out.println("SVNSVModification.b: "+SVNSVModification.b);
		
		//accessing directly by name or with class name, leads to CE
		//System.out.println("x: "+x);
		//System.out.println("y: "+y);

		//System.out.println("SVNSVModification.x: "+SVNSVModification.x);
		//System.out.println("SVNSVModification.y: "+SVNSVModification.y);
		
		//object craetion statement
		SVNSVModification e1 = new SVNSVModification();

		//accessing NSVs  with object 
		System.out.println("\ne1.x: "+e1.x);
		System.out.println("e1.y: "+e1.y);

		//accessing SVs  with object 
		System.out.println("e1.a: "+e1.a);
		System.out.println("e1.b: "+e1.b);
		
		//Second object creation
		SVNSVModification e2 = new SVNSVModification();
		
		//accessing NSVs  with second object 
		System.out.println("\ne2.x: "+e2.x);
		System.out.println("e2.y: "+e2.y);

		//accessing SVs  with second object 
		System.out.println("e2.a: "+e2.a);
		System.out.println("e2.b: "+e2.b);
		
		//Modifing Static  and Non-static variables with first object
		e1.a = e1.a + 10;
		e1.b = e1.b + 10;

		e1.x = e1.x + 10;
		e1.y = e1.y + 10;

		System.out.println("\nStatic and Non-static variables value after modiftcation");
		System.out.println("First object values");
		System.out.println("e1.a: "+e1.a);
		System.out.println("e1.b: "+e1.b);
		System.out.println("e1.x: "+e1.x);
		System.out.println("e1.y: "+e1.y);

		System.out.println("\nSecond object values");
		System.out.println("e2.a: "+e2.a);
		System.out.println("e2.b: "+e2.b);
		System.out.println("e2.x: "+e2.x);
		System.out.println("e2.y: "+e2.y);

		//NullPointerException, Referenced Variable creation with null, it is  also called as  null referenced variable
		SVNSVModification e3 = null;
		System.out.println("\naccessing S and NS variables with null referenced variable");
		System.out.println("e3.a: "+e3.a);
		System.out.println("e3.b: "+e3.b);

		System.out.println("e3.x: "+e3.x);
		System.out.println("e3.y: "+e3.y);
	
	}
}





