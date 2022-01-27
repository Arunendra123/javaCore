import java.util.*;

class ElementsRemove 
{
	public static void main(String[] args) 
	{
/*		
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(new Student(1, 10, "Hari",1));
		hs.add(new Student(2, 10, "Krishna",2));
		hs.add(new Student(1, 10, "Hari", 2));

		System.out.println(hs.size());
		System.out.println(hs);

		hs.remove(new Student(1, 10, "Hair"));
		System.out.println(hs.size());
		System.out.println(hs);
*/
		Student s1 = new Student(1, 1, "Hari"); 
		Student s2 = new Student(2, 1, "Hari"); 
		Student s3 = new Student(1, 1, "Hair"); 
		Student s4 = new Student(1, 1, "Hiar"); 
		Student s5 = new Student(1, 1, "Hari"); 
		
	//	System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));

//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());

		HashSet hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		System.out.println(hs.size());
		System.out.println(hs);


	}
}

class Student
{
	int sno;
	int whichclass;
	String name;

	Student(int sno, int whichclass, String name)
	{
		this.sno				= sno;
		this.whichclass	= whichclass;
		this.name				= name;
	}

	public boolean equals(Object obj)
	{
		System.out.println("In equals");
		if (obj instanceof Student)
		{
			Student s = (Student)obj;
			if (this.sno == s.sno && this.whichclass == s.whichclass && this.name.equalsIgnoreCase(s.name))
			{
				return true;
			}
		}
		return false;
	}

	public int hashCode()
	{
		System.out.println("In hashcode");
		int size	= this.name.length();
		int result = 1;		
		
		for (int i = 0 ; i < size ; i ++ )
		{
			result = result + (name.charAt(i) ) ;
		}

		return  this.sno + this.whichclass + result;		
	}
	public String toString()
	{
		return sno+ "-"+ whichclass +"-" + name;
	}
}