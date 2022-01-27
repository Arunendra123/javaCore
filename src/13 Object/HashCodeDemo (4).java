class Example{}

class HashCodeDemo
{
	public static void main(String[] args) 
	{
		Example e1 = new Example(); 
		Example e2 = new Example(); 

		System.out.println(e1.hashCode()); //1671711
		System.out.println(e2.hashCode()); //11394033

		//Contract between equals() and hashCode() methods
		System.out.println(e1 == e2); //false
		System.out.println(e1.equals(e2)); //false
		System.out.println(e1.hashCode() == e2.hashCode()); //false

		Example e3 = e2;
		System.out.println(e2 == e3); //true
		System.out.println(e2.equals(e3)); //true
		System.out.println(e2.hashCode() == e3.hashCode()); //true

		//in the below case the above contract is failed, as equals() method in Student class compares state of the objects.
		Student s1 = new Student(1, "Hari");
		Student s2 = new Student(1, "Hari");
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.hashCode() == s2.hashCode()); //false

		//Conclusion
		//Hence if equals() method is overridden in sub class, hashCode() method should also be overriden.
		//If we do not override hashCode() it will not leads CE or RE, you face bussiness problems. You will not get correct results.
	}
}