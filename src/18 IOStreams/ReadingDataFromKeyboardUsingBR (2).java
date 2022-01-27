import java.io.*;

class  ReadingDataFromKeyboardUsingBR
{
	public static void main(String[] args) throws IOException 
	{
		System.out.print("Enter text:" );

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		System.out.print("You entered: "+line);
	}
}