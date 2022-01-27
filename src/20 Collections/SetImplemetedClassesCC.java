import java.util.*;

class SetImplemetedClassesCC 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();

		hs.add(new A());
		System.out.println();
	
		hs.add(new A());
		System.out.println();
		
		hs.add(new String());
		hs.add(new String());


		System.out.println(hs);
		System.out.println(hs.size());

	}
}

class A
{
;