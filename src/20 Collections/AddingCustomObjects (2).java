//Sample.java
import java.util.*;

/*
class  Example 
{
	int x;
	Example(){}
	Example(int x){this.x = x;}
}

class AddingCustomObjects
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new Example());
		//ts.add(new Example());         RE: Exception in thread "main" java.lang.ClassCastException: Example cannot be 																																	cast to java.lang.Comparable
		//ts.add(new Example(20));
	}
}


public boolean add(Object obj)
{
	if (this.size() >1)
	{
		Comparable c = (Comparable)obj;
		c.compateTo(tsItr.next());
	}
}
*/

class  Example implements Comparable
{
	int x;
	
	Example(){}
	Example(int x){this.x = x;}

	public int compareTo(Object obj)
	{
		Example e = (Example)obj;
		
		//System.out.println(x);
		//System.out.println(e.x);

		return e.x - this.x;
	}

	public String toString()
	{
		return ""+x;
	}
}

class AddingCustomObjects
{
	public static void main(String[] args)
	{

		TreeSet ts = new TreeSet();

		ts.add(new Example());
		ts.add(new Example(20));
		ts.add(new Example());
		ts.add(new Example(5));
		ts.add(new Example(30));
		ts.add(new Example(20));
		ts.add(new Example());

		System.out.println(ts.size());
		System.out.println(ts);
	}
}
