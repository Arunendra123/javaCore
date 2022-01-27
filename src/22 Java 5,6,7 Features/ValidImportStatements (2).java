import java.lang.*;
import java.lang.System;
import java.lang.System.*; //allowed but static members are not accessible
//import java.lang.System.out; CE:
import static java.lang.System.out;
static import java.lang.System.out;

class ValidImportStatements 
{
	public static void main(String[] args) 
	{
		out.println("Hello World!");
	}
}
