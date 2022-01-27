import java.io.*;
class PrintStreamDemo 
{
	static PrintStream ps ;

	static 
	{
		try
		{
			ps = new PrintStream(new FileOutputStream("abc.txt"));
		}
		catch(FileNotFoundException fne)
		{
			fne.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{

		
		ps.println("abc");
		ps.println(10);
		ps.print("xyz");
		ps.println('A');
		ps.println(10.0);
		ps.println();
		//ps.print();

		ps.println(new Example());
		ps.println(new Sample());

		m1();


		System.out.println("Data is written to file");
	}

	static void m1()
	{
		ps.println("abc");
		ps.println(10);
		ps.print("xyz");
		ps.println('A');
		ps.println(10.0);
		ps.println();
		//ps.print();

		ps.println(new Example());
		ps.println(new Sample());


		System.out.println("Data is written to file");

	}
}

class Example{}
class Sample
{
	int x = 10;
	int y = 20;

	public String toString()
	{
		return	"sample class object: "+ x + " ... "+y;
	}
}