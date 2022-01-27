//Vodafone.java
public class Vodafone implements SIM 
{
	public String sendSMS(String msg, long mobilenumber)
	{
		return "Vodafone : Your SMS Send successfully";
	}	
	public String dialCall(long mobilenumber)
	{
		return "Vodafone: The number you are dialing is not reachable, please dial after some time";
	}	
}