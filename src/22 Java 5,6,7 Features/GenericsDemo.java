class Example<T>{
	void m1(T t){
		//String s = t.toUpperCase(); 
		/*
		CE: cannot find symbol
		symbol  : method toUpperCase()
		location: class java.lang.Object
			        String s = t.toUpperCase();
									   ^
		*/
		String name = t.getClass().getName();
		System.out.println(name);
		System.out.println(t.toString());
	}
}
class GenericsDemo 
{
	public static void main(String[] args) 
	{
		Example<String> e1 = new Example<String>();
		e1.m1("abc");
		
		//We can also create Generics type object with passing class name
		//If we do not specify any type, compiler replaces generic type with Object

		Example e2 = new Example();
		e2.m1(new StringBuffer("abc"));

	/*
		But compiler gives below note

		Note: GenericsDemo.java uses unchecked or unsafe operations.
		Note: Recompile with -Xlint:unchecked for details.
	*/

		Example<Test> e3 = new Example<Test>();
		//e3.m1("abc");
		e3.m1(new Test());
		e3.m1(new Abc());

	}
}
class Test{}
class Abc extends Test{}