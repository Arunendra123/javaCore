import java.io.*;

class ListFilesDemo 
{
	public static void main(String[] args) 
	{
		File f = new File("xyz");

		if(f.exists())
		{
				//String[] fileNames = f.list();
				File[] fileObjects	= f.listFiles();

			
				for (int i = 0; i < fileObjects.length; i++)
				{
					//String name = fileNames[i];
					//File f2 = new File(f + "\\" + name);

					File f2= fileObjects[i];



//					System.out.println(f2.getAbsolutePath());

					if(f2.isFile())
					{
						System.out.println(f2 +" is a file");
					}
					else if(f2.isDirectory())
					{
						System.out.println(f2 +" is a directory");
					}
				}
		}
		else
		{
			System.out.println(f + " is not existed");
		}
	}
}
