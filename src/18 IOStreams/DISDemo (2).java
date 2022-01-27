import java.io.*;

class  DISDemo
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream	fis		= new FileInputStream("pt.txt");
		DataInputStream dis	= new DataInputStream(fis);
		
		System.out.println(dis.readInt());			//97
		System.out.println(dis.readChar());		//a
		System.out.println(dis.readChar());		//a
		System.out.println(dis.readBoolean());	//true
		System.out.println(dis.readUTF());		//hari
	}
}
