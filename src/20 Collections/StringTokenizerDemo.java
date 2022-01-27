import java.util.*;
class StringTokenizerDemo 
{
	public static void main(String[] args) 
	{
		StringTokenizer s = new StringTokenizer("Hari Krishna");
		//StringTokenizer s = new StringTokenizer("Hari Krishna","r");
		//StringTokenizer s = new StringTokenizer("Hari Krishna","r",true);

		System.out.println(s.countTokens());
		//while (s.hasMoreElements())
		while (s.hasMoreTokens())
		{
			//String token = (String)s.nextElement();
			String token = s.nextToken();
			System.out.println(token.toUpperCase());
		}
	}
}
