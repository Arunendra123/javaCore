import java.util.*;
import java.io.*;

public class College 
{
	public static void main(String[] args) throws Exception 
	{
		LinkedHashMap	lhm	= new LinkedHashMap();

		lhm.put(new Student(11, "Rama"), new Address(1, 2, "Hyd"));
		lhm.put(new Student(11, "Raju"), new Address(1, 3, "Hyd"));

		lhm.put(new Student(12, "Sita"), new Address(12, 30, "Sec"));
		lhm.put(new Student(12, "Rani"), new Address(14, 30, "Sec"));

		//storing students information in file 
		FileOutputStream		fos	= new FileOutputStream("studentinfo.txt"); 
		ObjectOutputStream oos	= new ObjectOutputStream(fos);

		oos.writeObject(lhm);
		System.out.println("\n Student info is saved ");
	}
}