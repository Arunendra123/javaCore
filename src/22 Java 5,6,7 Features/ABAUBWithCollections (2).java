import java.util.*;

class ABAUBWithCollections 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(new Integer(50));
		al.add(10);  //=>	al.add(Integer.valueOf(10));

		//int i = al.get(0); CE: incompatible types
		//int i = (int)al.get(0);CE: inconvertible types

		int i = (Integer)al.get(0);
		int j = (Integer)al.get(1);
	

		System.out.println(i);
		System.out.println(j);
	}
}
