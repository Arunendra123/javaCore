import java.util.*;

class SetImplementedClasses 
{
	public static void main(String[] args) 
	{
		/*
		HashSet hs = new HashSet();

		System.out.println(hs.add("a"));
		System.out.println(hs.add("b"));
		System.out.println(hs.add("c"));
		System.out.println(hs.add(new Integer(10)));
		System.out.println(hs.add(null));

		System.out.println(hs.add("A"));
		System.out.println(hs.add("A"));
		System.out.println(hs.add(null));


		LinkedHashSet hs = new LinkedHashSet();

		System.out.println(hs.add("a"));
		System.out.println(hs.add("b"));
		System.out.println(hs.add("c"));
		System.out.println(hs.add(new Integer(10)));
		System.out.println(hs.add(null));

		System.out.println(hs.add("A"));
		System.out.println(hs.add("A"));
		System.out.println(hs.add(null));

		System.out.println(hs);

		*/

		TreeSet ts = new TreeSet();
		System.out.println(ts.add("z"));
		System.out.println(ts.add("a"));
		System.out.println(ts.add("y"));
		System.out.println(ts.add("y"));

		//System.out.println(ts.add(new Integer(10)));
		//System.out.println(ts.add(null));
		System.out.println(ts.add("10"));
		System.out.println(ts.add(Integer.toString(10)));
		System.out.println(ts.add(new String("10")));

		System.out.println(ts);

	}
}
