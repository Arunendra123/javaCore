import custexcep.*;

class AdditionUser 
{
	public static void main(String[] args) 
	{
		try
		{
			int x = Addition.add(5, 7);
			System.out.println(x);

			x = Addition.add(6, -8);
			System.out.println(x);
		}
		catch(NagativeArgumentException nae)
		{
			System.out.println(nae.getMessage());
		}
	}
}