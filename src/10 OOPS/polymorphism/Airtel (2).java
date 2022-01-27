//Airtel.java
public class Airtel implements SIM 
{
	public String sendSMS(String msg, long mobilenumber)
	{
		return "Airtel : Your SMS Send successfully";
	}	
	public String dialCall(long mobilenumber)
	{
		return "Airtel: The number you are dialing is busy, please dial after some time";
	}	
}