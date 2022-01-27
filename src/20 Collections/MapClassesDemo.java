//MapClassesDemo.java
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapClassesDemo 
{
	public static void main(String args[])
	{
		HashMap		hm 	= new HashMap();		
		LinkedHashMap	lhm 	= new LinkedHashMap();		
		TreeMap		tm 	= new TreeMap();

		hm.put("Tom", new Double(4000.00));
		hm.put("John", new Double(3500.50));
		hm.put("Smith", new Double(2125.25));

		lhm.put("Tom", new Double(4000.00));
		lhm.put("John", new Double(3500.50));
		lhm.put("Smith", new Double(2125.25));

		tm.put("Abc", new Double(4000.00));
		tm.put("Cbc", new Double(3500.50));
		tm.put("Bbc", new Double(2125.25));

		System.out.println("hm  elements : "+hm);
		System.out.println("lhm elements : "+lhm);
		System.out.println("tm  elements : "+tm);
		
		//Getting the set of keys and getting the iterator
		Set			set 			= hm.keySet();
		Iterator	hmitr 		= set.iterator();

		System.out.println("\nThe Account balance hm Account holders:");
		while(hmitr.hasNext()) 
		{
			Object key 		= hmitr.next();
			Object value	= hm.get(key);
			System.out.println(key +" : "+ value);
		}
		System.out.println();
		
		System.out.println("\nThe Account balance of lhm Account holders:");
		//Getting the set of Entries and getting Iterator
		Collection lhmcol 	= lhm.values();
		Iterator lhmitr 		= lhmcol.iterator();
		
		while(lhmitr.hasNext()) 
		{
			System.out.println(lhmitr.next());
		}
		System.out.println();
		
		System.out.println("\nThe Account balance of tm Account holders:");
		//Getting the set of Entries and obtaining Iterator
		Set tmset 		= tm.entrySet();
		Iterator tmitr 	= tmset.iterator();
		while(tmitr.hasNext()) 
		{
			Map.Entry me = (Map.Entry)tmitr.next();
			
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		double balance = ((Double)hm.get("John")).doubleValue();
		hm.put("John", new Double(balance + 1000));

		System.out.println("John's new balance: " + hm.get("John"));
	}
}
