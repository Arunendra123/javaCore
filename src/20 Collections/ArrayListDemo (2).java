//ArrayListDemo.java
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String args[]) 
	{
		// Creating an ArrayList
		ArrayList al = new ArrayList();
		System.out.println("Initial size of ArrayList: " + al.size()); //0
		
		//Add elements to the ArrayList
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Pink");
		al.add("Orange");
		
		System.out.println("\nSize of ArrayList after additions: " + al.size()); //5

		//Display the ArrayList
		System.out.println("\nContents of ArrayList After add: " + al); 
		
		// Remove elements from ArrayList		
		al.remove(4);
		System.out.println("\nContents of ArrayList after remove index: " + al);

		al.remove("Pink");
		System.out.println("\nContents of ArrayList after remove object: " + al);		
		System.out.println("\nSize of ArrayList after deletions: " + al.size());
		
		// Display the ArrayList
		System.out.println("\nContents of ArrayList after modification: " + al);
		
		StringBuffer sb 		= new StringBuffer();

		String alElement 	= (String)(al.get(1));
		System.out.println("alElement :"+alElement);

		al.add(alElement+" rose");
		System.out.println(al);
		
		System.out.println("al elements through Iterator");
		Iterator alIterator = al.iterator();		
		while(alIterator.hasNext())
		{
			String str = (String)alIterator.next();
			System.out.println(str);
			sb.append(str+",");
		}
		
		System.out.println("Array List values in string buffer :"+sb);
	}
}
