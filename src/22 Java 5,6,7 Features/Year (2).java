enum Months 
{
	JAN	,	FEB	,	MAR,	APR,	MAY
}

class Year
{
	public static void main(String[] args) 
	{
		System.out.println("Current Month: "+Months.MAY); //MAY
	}
}
/*
Defintion of enum:
=============
it is a final class deriving from java.lang.Enum that represents named constants

Need of enum
==========
- We  used to define final variables to represent a constant value.
- When we access those final variables it value is printed which is not meanful for end user
- to solve this problem enum is introduced

ex:

class Months
{
	public static final int MAY = 5;
};

class Year 
{
	public static void main(String[] arg)
	{
		Sopln("Current Month: "+Months.MAY);	
	}	
}

- Here 5 is printed which is not meaning full. 
- If we declare Months as enum we will MAY as output

1. enum  can be created in seperate java file or inside a class
2. enum can also have methods, in this case ; is mandatory after last named constant
*/