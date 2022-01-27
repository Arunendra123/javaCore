//FileURLDemo.java
/**
 *   This program demonstrates URL class.  
 */

import java.io.*;
import java.net.*;

public class FileURLDemo
{
	public static void main(String args[]) 
	{
		try 
		{
			File file		= new File("URLDemo.java");			
			String filePath 	= "file:///" + file.getAbsolutePath();
			URL fileURL		= new URL(filePath);

			InputStream in 	= fileURL.openStream();
			int data;

			while((data = in.read()) != -1) 
			{
				System.out.print((char)data);
			}
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
	}
}
