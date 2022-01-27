import java.io.*;

class FOSDemo 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileOutputStream fos = new FileOutputStream("bbc.txt",true);

		fos.write('A');
		fos.write('B');

		System.out.println("Data written to file");
	}
}
