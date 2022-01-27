class Example
{
	int x = 10;
	int y = 20;
}

class Comparision 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		int z = 10;

		System.out.println(x == y);
		System.out.println(x == z);

		boolean bo = true;
		//System.out.println(x == bo);

		//== operator compares object references, not state (values)
		//It returns true if both variables store same object reference, else return false
		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = e1;
		System.out.println(e1 == e2);
		System.out.println(e1 == e3);
		
		//In reference types comparision also == operator throws incomparable type CE, if both types are not compatible.
		Test t1 = new Test();
		//System.out.println(e1 == t1); //CE: incomparable types: Example and Test


		//comparing objects using Object class equals method
		//======================================
		//In Object class we have equals() method to compare two objects. It also compares two objects with their references only, like == operator. In side this method logic == operator is used.

		/*
			public boolean equals(Object obj)
			{	
				return this == obj;
			}
		*/

		System.out.println(e1.equals(e2)); //false
		System.out.println(e1.equals(e3)); // true

		//Note: equals() method returns false for incompatible types comparision. It does not throw CE because it doesnot know that those objects are comparing. It only checks whether equals() method can be invoked on e1 object by passing t1 object.

		//Since it is possible it compiles this statement.
		//JVM returns false because it only checks values not types. The object reference stored in e1 variable is different from object reference stored in t1 varible, so == operator returns false from equals() method.

		System.out.println(e1.equals(t1)); // false

		//comparing two nulls using == operator

		//comparing null with other null returns true
		System.out.println(null == null); // true

		//comparing null with null reference variable returns true
		Example e4 = null;
		System.out.println(null == e4); // true

		//comparing null with object reference variable returns false
		Example e5 = new Example();
		System.out.println(null == e5); // false

		//comparing null with object also returns false
		System.out.println(null == new Example()); // false

		//comparing two nulls using equals() method

		//we can not invoke method using null leads to compile time error
		//System.out.println(null.equals(null)); // <nulltype> cannot be dereferenced

			
		//we can not invoke method using null referenced variable leads to exception 
		Example e6 = null;
		//System.out.println(e6.equals(null)); // RE: NPE
		
		//we can invoke equals() method using object referenced variable by passing null
		Example e7 = new Example();
		System.out.println(e7.equals(null)); // RE: false

		/*
		Q) Why equals() method is specially given when == operator is already doing the objects comparision operation?

		- == opertor will only compare reference of the objects. 
		- Real world objects must be compared with their state.
		- For this purpose it should be overloaded.
		- But Java does not support operator overloading.
		- Hence as an alternative to == opertor, equals() method is given by sun to provide 	
		   "objects state comparision logic" by developer if need as per project requirement.

		- Like as == operator, in object class equals() method defined to compare two objects with reference not with state. Because of below two reasons
			1. Every object may not contain state
			2. Object class developer doesnot know the sub class required object state comparision logic.

		- Hence it is the sub class developer responsiblility to override equals() to compare sub class objects with their state.
		*/
	}
}

class Test
{
};