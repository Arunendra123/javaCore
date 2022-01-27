class Example{}
class Sample extends Example{}
class Test{}

class ArrayCastingDemo 
{
	public static void main(String[] args) 
	{
			Example[]	e		= new Example[5];	
			Object[]		obj1	= new Example[5];	
			Object			obj2	= new Example[5];	

			//Example e1 = new Example[2];  //CE: incompatible types
			Object obj3		= new Object[4];
			//Object[] obj4	= new Object();		//CE: incompatible types	

			Example[] e2 = new Sample[10];
			

			Object[] obj = new Example[4];
			obj[0] = new Example();
			obj[1] = new Sample();
			//obj[2] = new Test();


			int[] a = new int[5];
			//long[] l = a; //CE: incompatible types	
			Object[] o = a; //CE: incompatible types

			
	}
}