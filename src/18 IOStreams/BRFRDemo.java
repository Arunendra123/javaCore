import java.io.*;

class BRFRDemo 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("DOSDemo.java"));
		
		String line ;
		//while((line = br.readLine()) != null)
		while(br.ready())
		{
			line = br.readLine();
			System.out.println(line);
		}
	}
}

