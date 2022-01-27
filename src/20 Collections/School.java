import java.util.*;

class School 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
			
		hs.add(new Student(1, "Balayya"));
		hs.add(new Student(1, "Harikri"));

		hs.add(new Student(2, "Balayya"));
		hs.add(new Student(2, "Harikri"));
		hs.add(new Student(2, "Jr.NTR"));
		hs.add(new Student(2, "Jr.NTR"));

		hs.add(new Integer(8));
		hs.add(new Integer(10));

		hs.add(new String("a"));	

		System.out.println(hs);
		
		hs.remove(new Student(2, "Jr.NTR"));
		System.out.println("\nafter removing");
		System.out.println(hs);	
	}
}