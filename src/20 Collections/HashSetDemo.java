import java.util.*;

class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet hs1 = new HashSet();
		System.out.println(hs1.size()); //0

		HashSet hs2 = new HashSet();

		hs2.add("a");
		hs2.add("b");

		System.out.println(hs2.size());//2

		HashSet hs3 = new HashSet(hs2);
		System.out.println(hs3.size());//2

		//HashSet hs4 = new HashSet(null); RE: j.l.NPE
		//System.out.println(hs4.size());

		HashSet hs5 = new HashSet(6);
		System.out.println(hs5.size());//0

		//HashSet hs6 = new HashSet(-6); //RE: j.l.IAE: IllegalInitialCapacity: -6

	}
}
