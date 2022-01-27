import java.io.*;
import java.util.*;

public class CollegeWebSite 
{
	public static void main(String[] args) throws Exception
	{
		//reading studnets information from file
		FileInputStream			fis	= new FileInputStream("studentinfo.txt"); 
		ObjectInputStream	ois	= new ObjectInputStream(fis);

		LinkedHashMap	lhm	= (LinkedHashMap)ois.readObject();

		Set keySet			=	 lhm.keySet();
		Iterator keyItr	=	 keySet.iterator();
		
		while (keyItr.hasNext())
		{
			Object key		= keyItr.next();
			Object value	= lhm.get(key);

			System.out.println(key + " student Address");
			System.out.println(value);

			System.out.println();
		}
	}
}


