//Docomo.java
public class Docomo implements SIM 
{
	public String sendSMS(String msg, long mobilenumber)
	{
		return "Docomo : Your SMS Send successfully";
	}	
	public String dialCall(long mobilenumber)
	{
		return "Docomo: The number you are dialing is switched off, please dial after some time";
	}	
}