import java.util.*;
class EFORwithCollection 
{
	public static void main(String[] args) 
	{
/*
		//working with normal arraylist
		ArrayList al = new ArrayList();

		al.add("a");
		al.add(10);
		al.add("b");
		
		for (Object obj : al)
		{
			String s = (String)obj;
			System.out.println(s.toUpperCase());
		}
*/
/*
		for (String s : al)  CE: incompatible types, because the coming object is of type Object
		{
				System.out.println(s);
		}
*/

		//working with generic type arraylist
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		
		for (Integer io : al)
		{
			System.out.println(io);
		}
	}
}
