class School
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "studentone", 1);
		Student s2 = new Student(2, "studenttwo", 1);
		Student s3 = new Student(1, "studentone", 1);

		Student s4 = new Student(1, "studentten", 1);

		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println();
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());

		System.out.println();
		System.out.println(s1.equals(s4));
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());

/*
		Test t = new Test();
		System.out.println(t.equals(s3));
		System.out.println(s3.equals(t));

		System.out.println(s3.equals(null));

*/



	}
}
