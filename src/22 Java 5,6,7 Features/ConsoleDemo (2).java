import java.io.*;

class ConsoleDemo 
{
	public static void main(String[] args) 
	{
		Console c = System.console();

		System.out.print("Enter first Number: ");
		String n1 = c.readLine();
		
		System.out.print("Enter second Number: ");
		String n2 = c.readLine();

		int n3 = Integer.parseInt(n1) +  Integer.parseInt(n2);
		System.out.print("Result: "+n3);


	}
}
