import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Server1 {
	public static void main(String args[]) 
	{
		try 
		{
			ServerSocket ss = new ServerSocket(4444);
			System.out.println("Server is ready...");

			Socket s = ss.accept();

			System.out.println("Connection is accepted...");

			System.out.println("Sent a message to the client...");
			OutputStream out = s.getOutputStream();
			DataOutputStream dos1 = new DataOutputStream(out);
	
			dos1.writeBytes("Hello");

			dos1.close();
			s.close();
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
	}
}
