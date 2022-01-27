//MobileUser.java => keypad logic
import java.io.*;

public class MobileUser 
{
	public static void main(String[] args) throws Exception
	{
		Mobile micromax	= new Mobile();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Insert SIM: ");
		String simName	= br.readLine();
		micromax.insertSIM(simName);

		System.out.println();

		System.out.println("Type 1 and press <Enter> key  to Send SMS ");
		System.out.println("Type 2 and press <Enter> key  to Make Call\n ");

		System.out.print("Enter option:");
		String option	= br.readLine();

		String resp ;
		
		if(option.contains("1"))
		{
			System.out.println("Type message and press <Enter> key:");
			String msg = br.readLine();

			System.out.println("Type mobile number and press <Enter> key:");
			String mobilenumber = br.readLine();

			resp = micromax.sendSMS(msg, Long.parseLong(mobilenumber));
			System.out.println(resp);
		}
		else if(option.contains("2"))
		{
			System.out.println("Type mobile number and press <Enter> key:");
			String mobilenumber = br.readLine();

			resp = micromax.dialCall(Long.parseLong(mobilenumber));
			System.out.println(resp);
		}
		else
		{
				System.out.println("Invalid Option");
		}
	}
}