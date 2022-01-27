//CustomComparatorDemo.java

import java.util.*;
class StringBufferComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		//System.out.println();
		//System.out.println("obj1: "+obj1);
		//System.out.println("obj2: "+obj2);

		StringBuffer sb1 = (StringBuffer)obj1;
		StringBuffer sb2 = (StringBuffer)obj2;

		String s1 = sb1.toString();
		String s2 = sb2.toString();
			
		return s2.compareTo(s1);
	}
}

class CustomComparatorDemo 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(new StringBuffer("a"));
		//ts.add(new StringBuffer("b")); RE: CCE

		System.out.println(ts);

		TreeSet custTS = new TreeSet(new StringBufferComparator());
		custTS.add(new StringBuffer("b"));
		custTS.add(new StringBuffer("a")); //=> sbc.comapre(sb1 , sb2);
		custTS.add(new StringBuffer("c"));

		System.out.println(custTS);
	}
}