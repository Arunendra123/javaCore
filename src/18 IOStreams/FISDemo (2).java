import java.io.*;

class FISDemo 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("abc.txt");

		int i;
		while( ( i = fis.read() ) != -1)
		{
			System.out.print((char)i + " .... ");
			System.out.println(i);

		}
	}
}
