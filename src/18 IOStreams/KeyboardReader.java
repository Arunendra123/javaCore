import java.io.*;

class KeyboardReader 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter First int number: ");
		String n1 = br.readLine();

		System.out.print("Enter second int number: ");
		String n2 = br.readLine();

		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);

		int c = a + b;

		System.out.print("Result: "+ c);

	}
}
