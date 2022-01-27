//URLDemo.java
/**
 * This program demonstrates URL class.
 */

import java.net.URL;

public class URLDemo 
{
	public static void main(String args[]) 
	{
		try 
		{
			URL u = new URL("http://system1:1024/NetDemo2.java");
			System.out.println("\nProtocol: " + u.getProtocol());
			System.out.println("\nPort: " + u.getPort());
			System.out.println("\nFile: " + u.getFile());
			System.out.println("\nHost: " + u.getHost());
			System.out.println("\nPath: " + u.toExternalForm());
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
	}
}
