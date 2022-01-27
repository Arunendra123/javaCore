import java.io.*;

class STDOutDemo 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Data before setOut() Method"); // printed on console
		System.err.println("Data before setErr() Method"); // printed on console

		PrintStream outps = new PrintStream(new FileOutputStream("output.txt"));
		PrintStream errps = new PrintStream(new FileOutputStream("err.txt"));

		//changing default streams
		System.setOut(outps);
		System.setErr(errps);

		System.out.println("Data after setOut() Method"); // printed in output.txt file
		System.err.println("Data after setErr() Method"); // printed in err.txt
		int x = 10/0; //AE exception is printed in err.txt
	}
}