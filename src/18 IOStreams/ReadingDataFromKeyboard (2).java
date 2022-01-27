import java.io.*;

class ReadingDataFromKeyboard 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("Enter some text:");
		int data = System.in.read();

		System.out.print("You entered: "+(char)data);
	}
}