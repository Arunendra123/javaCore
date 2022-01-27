import java.util.*;

class TreeSetTreeMapDemo 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();

		ts.add(new StringBuffer("abc"));
		ts.add(new StringBuffer("abc"));
		ts.add("cbc");
		System.out.println(ts);
		ts.add("cbc");
		System.out.println(ts);

		TreeMap tm = new TreeMap();

		tm.put("abc","10");
		tm.put("xyz","5");
		tm.put("cbc","1");
		System.out.println(tm);
		tm.put("cbc","6");
		System.out.println(tm);

		TreeSet ts1 = new TreeSet();
		
		Example e1 = new Example(10);
		Example e2 = new Example(20);
		Example e3 = new Example(30);
		Example e4 = new Example(30);

		ts1.add(e1);	
		ts1.add(e2); //=>e2.compareTo(e1);
		ts1.add(e3);
		ts1.add(e4);
		System.out.println(ts1);
	}
}
class Example implements Comparable
{
	int x;
	Example(int x)
	{
		this.x = x;
	}

	public int compareTo(Object obj)
	{
		Example e = (Example)obj;
		return e.x - this.x;
	}

	public String toString()
	{
		return ""+x;
	}
}



















