class Example{}
class Sample extends Example{}
class Test{}

class  ObjectsComparision
{
	public static void main(String[] args) 
	{
		/*
		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = e2;

		System.out.println(e1 == e2); //false
		System.out.println(e2 == e3); // true
		System.out.println(e1 == e1); // true

		Sample s1 = new Sample();
		System.out.println(e1 == s1); // false
		
		Test t1 = new Test();
		//System.out.println(e1 == t1); // CE: incomparable types: Example and Test

		System.out.println(new Example() == new Example()); // false
		 */
		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = e2;
		
		System.out.println(e1 == e2); //false
		System.out.println(e1.equals(e2)); //false

		System.out.println(e2 == e3); //false
		System.out.println(e2.equals(e3)); //false


		Test t = new Test();
		//System.out.println(t == e3); //incomparable types: Test and Example
		System.out.println(t.equals(e3));

	
	}
}