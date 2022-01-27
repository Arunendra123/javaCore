import java.io.*;

class  DOSDemo
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream	fos	= new FileOutputStream("pt.txt");
		DataOutputStream dos	= new DataOutputStream(fos);
		
		dos.writeInt(97);
		dos.writeChar('a');
		dos.writeChar(97);
		dos.writeBoolean(true);
		dos.writeUTF("hari");


		System.out.println("Data written to file");
	}
}
