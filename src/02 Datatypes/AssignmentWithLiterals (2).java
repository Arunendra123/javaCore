class AssignmentWithLiterals 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		byte b2 = 'a';

		char ch = 'a';
		//byte b3 = ch;

		//byte b3 = 254;
		short s1 = 254;

		double d = 37.435;
		//float f  = 37.435;
		float f  = 37.435f;

		long l = 10L;
		//int i = 10L;

		char ch2 = (char)256;


		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		System.out.println("s1: "+s1);
		System.out.println("d: "+d);
		System.out.println("f: "+f);
		System.out.println("l: "+l);
		System.out.println("ch2: "+ch2);
	}
}
