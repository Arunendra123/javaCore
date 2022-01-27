//InetAddressDemo.java 
/**
 * This program demonstrates InetAddress class.
 */

 import java.net.InetAddress;

 public class InetAddressDemo
 {
	public static void main(String args[]) 
	{
		try 
		{
			InetAddress add = InetAddress.getLocalHost();
			System.out.println("\nLocal Host Details	: " + add);
			System.out.println("The Host IP Address is	: " + add.getHostAddress());
			System.out.println("The Host name is		: " + add.getHostName());

			add = InetAddress.getByName("Reflection16");
			System.out.println("\nLocal Host: " + add);
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
	}
}
