import java.util.*;

class EnhancedForLoop 
{
	public static void main(String[] args) 
	{
		int[] ia = {10, 20, 30, 40};
		
		//1.4 based for loop
		for (int i = 0; i < ia.length; i++)
		{
					int arrayValue	= ia[i];
					System.out.println(arrayValue);
		}	

		//1.5 based for loop, enhanced for loop
		for (int arrayValue : ia )
		{
				System.out.println(arrayValue);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		//1.4 based for loop	
		for (int i = 0; i < al.size(); i++)
		{
					int arrayListValue	= al.get(i);
					System.out.println(arrayListValue);
		}	
		
		//1.5 based for loop, enhanced for loop
		for (int arrayListValue : al )
		{
				System.out.println(arrayListValue);
		}

	
	}
}
