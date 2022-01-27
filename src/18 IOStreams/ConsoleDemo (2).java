import java.io.*;

class  ConsoleDemo
{
	public static void main(String[] args) throws IOException 
	{
		System.out.print("Enter text:" );

		Console keyboard = System.console();

		String line = keyboard.readLine();

		System.out.print("You entered: "+line);
	}
}