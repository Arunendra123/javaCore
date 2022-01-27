class Test 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t); //=>	System.out.println(t.toString());

		Student s1 = new Student(1, "sone", 1);
		Student s2 = new Student(1, "stwo", 1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*
public String toString()
{
	return (
					this.getClass().getName() + "@" + 
					Integer.toHexString(this.hashCode())
				);
}
*/