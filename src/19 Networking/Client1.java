
import java.io.*;
import java.net.Socket;

class Client1 
{
	public static void main(String args[]) 
	{
		try
		{
			Socket s = new Socket("localhost", 4444);

			InputStream	 in = s.getInputStream();
			DataInputStream dis1 = new DataInputStream(in);

			String msg1 = dis1.readLine();
			System.out.println("Server message is: " + msg1);
			dis1.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
	}
}

