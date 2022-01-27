//Deleting directory files
import java.io.File;

public class DirectoryDelete
{
	public static void directoryDelete(String file)
	{
		directoryDelete(new File(file));
	}
	public static void directoryDelete(File dir)
	{
		try
		{
			if(dir != null)
			{
				File dirList[] = dir.listFiles();
				
				if(dirList != null )
				{
					for (int i = 0 ; i < dirList.length ; i++ )
					{
						File file = dirList[i];

						if(file.isFile())
						{							
							file.delete();
						}
						else
						{
							directoryDelete(file);
						}
					}
				}
				dir.delete();
			}
			else 
			{
				System.out.println("directory is null");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Test
{
	public static void main(String[] args)
	{
		//incurrent directory create a directory test with files and sub folders, then pass it as argument to this method
		DirectoryDelete.directoryDelete("test");
	}
};