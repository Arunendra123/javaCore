/*
 * ComparatorDemo.java 
 * This program demonstrates developing a custom Comparator. 
 *	- this program shows you how can we change the natural order of 
	   predefined objects, like String and wrapper classes.
 */
import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator 
{
	public int compare(Object a, Object b) 
	{
		String aStr, bStr;
		aStr = (String) a;
		bStr = (String) b;

		// Reverse the comparison
		return bStr.compareTo(aStr);
	}
}

public class ComparatorDemo 
{
	public static void main(String args[]) 
	{
		/*
		    - Creating a TreeSet object using no-arg constuctor, 
		    - Since we create the TS object using no-arg constructor, 
		    - elements are sorted according to natual sorting order of those objects
		 */
		TreeSet ts = new TreeSet();

		// Add elements to the TreeSet
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		System.out.println("ts object with detault comparator :"+ts);
				
		/*
		    - Creating a TreeSet object using comparator parameter constuctor, 
		    - to sort elements according to custom comparator sorting order
		 */

		TreeSet tsc = new TreeSet(new StringComparator());
		tsc.add("C");
		tsc.add("A");
		tsc.add("B");
		tsc.add("E");
		tsc.add("F");
		tsc.add("D");

		System.out.println("tsc object with custom comparator :"+tsc);
	}
}
