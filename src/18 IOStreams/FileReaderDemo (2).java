import java.io.*;

class  FileReaderDemo
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis =  new FileInputStream("abc.txt");

			int i ;
			while ((i = fis.read()) != -1)
			{
				System.out.print(i+" .... ");
				System.out.println((char)i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
}
