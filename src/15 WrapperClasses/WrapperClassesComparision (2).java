class WrapperClassesComparision 
{
	public static void main(String[] args) 
	{
		int i1 = 10;
		int i2 = 10;

		System.out.println(i1 == i2);
		//System.out.println(i1.equals(i2));//int cannot be dereferenced

		Integer io1 = new Integer(10);
		Integer io2 = new Integer(10);

		System.out.println(io1 == io2);
		System.out.println(io1.equals(io2));

		//Wrapper classes type conversion
		/*
			Wrapper classes are not compatible to each other, because they are siblings
			If we use "==" operator to compare their objects it leads to CE: incomparible types
			But we can compare them using equals() method, it returns false => No CE or No RE.
		*/

		Double do1 = new Double(10.0);
		//System.out.println(io1 == do1); CE: incomparable types: java.lang.Integer and java.lang.Double
		System.out.println(io1.equals(do1)); //false

		double d1 = 10.0;
		System.out.println(i1 == d1); //true

		//=> System.out.println(10 == 10.0);
		//=> System.out.println(10.0 == 10.0);

	}
}
