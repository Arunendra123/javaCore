import java.io.*;

class FileDeleteDemo 
{
	public static void main(String[] args) 
	{
		File f = new File("a");

		if(f.exists())
		{
			f.delete();

			if(f.exists())
			{
				System.out.println( f + " is not deleted");
			}
			else
			{
				System.out.println( f + " is deleted");
			}
		}
		else
		{
			System.out.println( f + " is not existed");
		}

	}
}
