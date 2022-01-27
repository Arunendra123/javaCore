class HashCodeDemo 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = t2;

		System.out.println(t1.equals(t2));	

		System.out.println(t1.hashCode());	
		System.out.println(t2.hashCode());	
		
		System.out.println();	

		System.out.println(t2.equals(t3));	

		System.out.println(t2.hashCode());	
		System.out.println(t3.hashCode());	
	}
}


