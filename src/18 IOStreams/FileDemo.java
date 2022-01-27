import java.io.*;

class FileDemo 
{
	public static void main(String[] args) throws Exception
	{
//		FileInputStream  fis = new FileInputStream("Xyz.txt");
		
	//	FileOutputStream  fos = new FileOutputStream("Xyz.txt");

		File f1 = new File("C:\\abc\\Xyz.txt"); //Rule: abc folder should exist

		String filePath	= f1.getAbsolutePath();

		boolean b = f1.exists();

		System.out.println("filePath: "+filePath); //C:\abc\Xyz.txt
		System.out.println("is file existed: "+b);
		
		//creating xyz.txt as file
		boolean fileCreated = f1.createNewFile();
		System.out.println("is file created: "+fileCreated);
	
	//=============================================================	
		File f2 = new File("pqr"); 
		
		System.out.println("filePath: "+f2.getAbsolutePath()); // D:\JavaHari\01-OCP_JSE\7AM-02\16IOStreams\pqr

		//creating pqr as Directory
		System.out.println("is directory created: "+f2.mkdir()); 
		
  //=============================================================	
		File f3 = new File("pqr", "xyz"); 
		
		System.out.println("filePath: "+f3.getAbsolutePath()); // D:\JavaHari\01-OCP_JSE\7AM-02\16IOStreams\pqr\xyz

		//creating xyz as Directory inside pqr
		System.out.println("is directory created: "+f3.mkdir()); 

  //=============================================================	
		File f4 = new File("a", "b"); 
		
		System.out.println("filePath: "+f4.getAbsolutePath()); // D:\JavaHari\01-OCP_JSE\7AM-02\16IOStreams\a\b

		//creating b as file, if a is not existed it leads to exceptoin IOException
		//System.out.println("is file created: "+f4.createNewFile()); 

		//creating b as directory. If a is not existed, b will not created and returns false
		System.out.println("is directory created: "+f4.mkdir()); 

		//creating a and b both as directories at a time, b is created inside a
		System.out.println("is directory created: "+f4.mkdirs()); 
	}
}