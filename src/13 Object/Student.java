//Student.java
public class Student 
{
	private int			sno;
	private String	sname;

	public Student(int sno, String sname)
	{
		this.sno			= sno;
		this.sname		= sname;
	}
	
	//overriding equals() method
	public boolean equals(Object obj)
	{
		//comparing both objects reference, if reference in varaibles is same return true, because same object is passed, else compare state
		if(this == obj){
			return true;
		}
		else{
			//comparing state, checking passed object is compatible or not
			if (obj instanceof Student)
			{
				//casting passed object into Student
				Student  s = (Student)obj;
				
				//comparing state of current object and passed object
				return  this.sno == s.sno &&
							 this.sname.equals(s.sname);
			}
			else
			{
				//returning false as per contract, because passed object is incompatible.
				return false;
			}
		}
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "Hari");
		Student s2 = new Student(2, "Krishna");
		Student s3 = new Student(1, "Hari");
		Student s4 = s2;
		
		System.out.println(s1 == s2); //false, different references
		System.out.println(s1.equals(s2));//false, different state
		System.out.println();

		System.out.println(s1 == s3); // false, different references
		System.out.println(s1.equals(s3));// ture, same state => but objects are different

		System.out.println(s2 == s4); // true, both reference variablers contain same object refernce
		System.out.println(s2.equals(s4)); //true

		Address add = new Address();

		//System.out.println(s1== add); //CE: incomparable types: Address and Student
		System.out.println(s1.equals(add)); //false, incompatible objects comparision, it returns false1

		//comparing two nulls
		System.out.println(null == null); //true
		//System.out.println(null.equals(null)); //CE: <nulltype> cannot be dereferenced

		Address a1 = null;
		Address a2 = null;
		
		//comparing null will null always retuns true, but equals() throws NPE
		System.out.println(a1 == a2); //true
		//System.out.println(a1.equals(a2)); //true
		
		//comparing null with object always retruns false 
		Address a3 = new Address();
		System.out.println(a3 == a2); //false
		System.out.println(a3.equals(a2)); //false

		System.out.println(s2.equals(a2)); //false
	}
}

class Address{}