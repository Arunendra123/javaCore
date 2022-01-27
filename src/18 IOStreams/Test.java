import java.io.*;
class Test 
{
	public static void main(String[] args) 
	{
		PrintStream ps = null;

//		System.out.println(ps);
//		System.out.println(PrintStreamDemo.ps);

//		PrintStreamDemo.ps.println(ps);
//		PrintStreamDemo.ps.println(PrintStreamDemo.ps);

//		System.out.println(System.out);
//		PrintStreamDemo.ps.println(System.out);

		PrintStream ps1 = new PrintStream(PrintStreamDemo.ps);
		PrintStream ps2 = new PrintStream(System.out);

		ps1.println("H");
		ps2.println("K");





	}
}
