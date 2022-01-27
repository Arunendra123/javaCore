class WrapperClassDemo 
{
	public static void main(String[] args) 
	{
		//PDT => WCO
/*		int i = 10;
		Integer io1 = new Integer(i);
		Integer io2 = Integer.valueOf(i);

		System.out.println("i: "+i);
		System.out.println("io1: "+io1);
		System.out.println("io2: "+io2);
*/
		//WCO => PDT
/*		Integer io3 = Integer.valueOf(254);
		int		x		= io3.intValue();
		byte		b		= io3.byteValue();
		short	s		= io3.shortValue();
		float	f		= io3.floatValue();

		//char	ch		= io3.charValue();
		//char	ch		= io3.intValue();
		char	ch		= (char)io3.intValue();

		//boolean	bo	= io3.booleanValue();
		//boolean	bo	= io3.intValue();
		//boolean	bo		= (boolean)io3.intValue();

		System.out.println("x: "+x);
		System.out.println("b: "+b);
		System.out.println("s: "+s);
		System.out.println("f: "+f);
		System.out.println("ch: "+ch);
*/
		//NSO => WCO
/*
		Integer io1 = new Integer("10");
		Integer io2 = Integer.valueOf("1");

		Byte bo1 = Byte.valueOf("1");
		//Byte bo2 = Byte.valueOf("128"); RE: java.lang.NumberFormatException: Value out of range. 	
																				//Value:"128" Radix:10

		//Integer io3 = Integer.valueOf("a");	RE: java.lang.NumberFormatException: For input string: "a"
		//Integer io3 = new Integer("5.4");		RE: java.lang.NumberFormatException: For input string: "5.4"
		//Integer io3 = new Integer("5L");		RE: java.lang.NumberFormatException: For input string: "5L"
		
		Float fo1 = new Float("5"); 
		Float fo2 = new Float("5.4"); 
		Float fo3 = new Float("567.432F"); 
		
		System.out.println("io1: "+io1);
		System.out.println("io2: "+io2);
		System.out.println("bo1: "+bo1);
		System.out.println("fo1: "+fo1);
		System.out.println("fo2: "+fo2);
		System.out.println("fo3: "+fo3);
*/
		//boolean  String Object => Boolean WCO
		//	"false" | "true" => WCO
/*
		Boolean bo1 = new Boolean("false");
		Boolean bo2 = new Boolean("true");

		Boolean bo3 = Boolean.valueOf("false");
		Boolean bo4 = Boolean.valueOf("true");

		Boolean bo5 = Boolean.valueOf("True");
		Boolean bo6 = Boolean.valueOf("TrUe");
		Boolean bo7 = Boolean.valueOf("FALSE");

		Boolean bo8 = Boolean.valueOf("FASLE");
		Boolean bo9	= Boolean.valueOf("TURE");
		Boolean bo10	= Boolean.valueOf("Hari");
		Boolean bo11	= Boolean.valueOf("");

		System.out.println("bo1: "+bo1);
		System.out.println("bo2: "+bo2);
		System.out.println("bo3: "+bo3);
		System.out.println("bo4: "+bo4);

		System.out.println();

		System.out.println("bo5: "+bo5);
		System.out.println("bo6: "+bo6);
		System.out.println("bo7: "+bo7);
		System.out.println("bo8: "+bo8);
		System.out.println("bo9: "+bo9);
		System.out.println("bo10: "+bo10);
		System.out.println("bo11: "+bo11);
*/

		//NSO => PDT

		//1. NSO => WCO => PDT
		//2. NSO => PDT
/*
		int i1 = Integer.parseInt("10");
		//int i2 = Integer.parseInt("10.0"); //RE: java.lang.NumberFormatException: For input string: "10.0"

		//byte b1 = Byte.parseInt("40"); CE: c f s
		byte b1 = Byte.parseByte("40"); 
		//byte b2 = Byte.parseByte("128"); //java.lang.NumberFormatException: Value out of range.

		float f1 = Float .parseFloat("10");
		float f2 = Float .parseFloat("50.456");
		float f3 = Float .parseFloat("606.678F");

		boolean bo1 = Boolean.parseBoolean("TRUE");
		boolean bo2 = Boolean.parseBoolean("FALSE");
		boolean bo3 = Boolean.parseBoolean("Hari");
		boolean bo4 = Boolean.parseBoolean("TURE");

		System.out.println("i1: "+ i1);
		System.out.println("b1: "+ b1);
		System.out.println("f1: "+ f1);
		System.out.println("f2: "+ f2);
		System.out.println("f3: "+ f3);
		System.out.println("bo1: "+ bo1);
		System.out.println("bo2: "+ bo2);
		System.out.println("bo3: "+ bo3);
		System.out.println("bo4: "+ bo4);
	

		String		s		= "10";
		Integer	io		= Integer.valueOf(s);
		int			i	 	= io .intValue();

		System.out.println("s: "+ s);
		System.out.println("io: "+ io);
		System.out.println("i: "+ i);

		double d = Double.valueOf(s).doubleValue();
		System.out.println("d: "+ d);
*/		
		
		//PDT => NSO
		//String s1 = 10;	CE: incompatible  types
/*
		String s1 = "10";
		String s2 = Integer.toString(10);

		//String s3 = Byte.toString(10); //CE: c f s
		String s3 = Byte.toString((byte)10);

		String s4 = Integer.toString('a');

		//String s5 = Integer.toString("a"); //CE: c f s
		//String s5 = Integer.toString(10.0);//CE: c f s

		String s5 = Float.toString(20);
		String s6 = Float.toString(30L);
		String s7 = Float.toString(40.0f);
		String s8 = Float.toString(50.0F);
		//String s9 = Float.toString(60.0);	 //CE: c f s

		String s9 = Boolean.toString(false);
		String s10 = Boolean.toString(true);
		//String s11 = Boolean.toString(TRUE); CE: c f s variable TRUE

		System.out.println("s1: "+ s1);
		System.out.println("s2: "+ s2);
		System.out.println("s3: "+ s3);
		System.out.println("s4: "+ s4);
		System.out.println("s5: "+ s5);
		System.out.println("s6: "+ s6);
		System.out.println("s7: "+ s7);
		System.out.println("s8: "+ s8);
		System.out.println("s9: "+ s9);
		System.out.println("s10: "+ s10);
*/
		//WCO => String
		Integer io = new Integer(299);
		System.out.println(io);
		System.out.println(io.toString());
		System.out.println("==================");

		A a = new A(299);
		System.out.println(a);
		System.out.println(a.toString());

		intValue()
		getSal()
		getName()
	
	}
}

class A
{
	int value;
	A(int value)
	{
		this.value = value;
	}

	public String toString()
	{
		return String.toString(value);
	}
}