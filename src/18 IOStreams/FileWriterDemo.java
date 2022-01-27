import java.io.*;

class  FileWriterDemo
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos =  new FileOutputStream("bbc.txt");
			
			fos.write(-128);
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
}
