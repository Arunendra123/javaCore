/*
 * IteratorMethodsDemo.java
 *
 * Below program shows the rules we should follow while retrieving elements using Iterator
 */

import java.util.LinkedHashSet;
import java.util.Iterator;

public class IteratorMethodsDemo  
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Abc");
		lhs.add("Cbc");
		lhs.add("Dbc");
		lhs.add(new Integer(10));
		
		Iterator lhsIterator = lhs.iterator();
		while(lhsIterator.hasNext())
		{
			
			 lhsIterator.remove();
			 //java.lang.IllegalStateException 
			
			Object ob = lhsIterator.next();
			System.out.println("lhs object in while :"+ob);
			
			//lhsIterator.remove();
			
			
			if(ob instanceof Integer)
			{
				lhsIterator.remove();
			}			
			
		}//while closed

		System.out.println("lhs after iteration : "+ lhs);		//[] [Abc, Cbc, Dbc]
	}
}
