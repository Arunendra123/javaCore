class TestingPoints 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		byte b2 = 100;
		//byte b3 = 254;
		byte b3 = (byte)254;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		char ch1  = 'a';
		char ch2  = 98;
		System.out.println(ch1);
		System.out.println(ch2);

		int i1  = 97;
		int i2  = 'b';
		System.out.println(i1);
		System.out.println(i2);

		int a = 10;
		//byte b = a;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);

		long l = 10;
		float f = l;
		System.out.println(l);
		System.out.println(f);
	
		//long l2= f;
		float f2 = 24.97f;
		long l2= (long)f2;
		System.out.println(f2);
		System.out.println(l2);

		float f3 = 254.97f;
		byte b4= (byte)f3;
		System.out.println(f3);
		System.out.println(b4);
		
		System.out.println(22/7 * 10 * 10);     //300
		System.out.println(22.0/7 * 10 * 10);  //314.285.....

		int i10 = 22/7 * 10 * 10;
		//float f10 = 22.0/7 * 10 * 10;
		/*
		TestingPoints.java:49: possible loss of precision
		found   : double
		required: float
                float f10 = 22.0/7 * 10 * 10;
		*/
		float f10 = 22.0f/7 * 10 * 10;	
		float f11 = (float)(22.0/7 * 10 * 10);	
		double d = 22.0/7 * 10 * 10;
		
		byte b12 = 10;
		byte b13 = 20;
		//byte b14 = b12 + b13;
		//byte b14 = (byte)b12 + b13;
		//byte b14 = (byte)b12 + (byte)b13;
		byte b14 = (byte)(b12 + b13);
		int a14 = b12 + b13;
		System.out.println(b14);  //10
		System.out.println(a14);  //10

		char ch12 = 'a';
		char ch13 = 'b';
		//char ch14 = ch12 + ch13;
		char ch14 = (char)(ch12 + ch13);
		int i14 = ch12 + ch13;
		System.out.println(ch14);  //|-
		System.out.println(i14);  //195



	}
}