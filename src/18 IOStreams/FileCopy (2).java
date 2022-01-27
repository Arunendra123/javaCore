import java.io.*;

class  FileCopy
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis =  new FileInputStream(args[0]);
			//FileOutputStream fos =  new FileOutputStream(args[1]); -overrides
			FileOutputStream fos =  new FileOutputStream(args[1],true); //append

			int i ;
			while ((i = fis.read()) != -1)
			{
				System.out.print(i);
				fos.write(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
}
