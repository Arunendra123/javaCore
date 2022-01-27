class AutomaticPromotions 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;

		//no promotions
		int c = a + b;

		System.out.println(c);

		int i1 = 10;
		float f1 = 20;
		
		//result is promoted to float, 
		float f2 = i1 + f1; 
		//int i2  =  i1 + f1;		CE: p l p
		//int i2  =  (int)i1 + f1;		CE: p l p

		//to store result in int type variable we should do casting, as shown below 
		int i2 = i1 + (int)f1; // this is not recommanded, should apply cast operator to result, not to individual variables
		int i3 = (int)(i1 + f1);

		System.out.println(f2); //30.0
		System.out.println(i2); //30
		System.out.println(i3); //30


		//byte, short and char varaibles are promotted to int type. 
		//Hence the expression result can only be stored in int type variable. 
		//To store that result in same type variable use cast operator as shown below.
		
		byte b1 = 10;
		byte b2 = 20;

		//byte b3 = b1 + b2;		CE: p l p
		int i4 = b1 + b2;
		
		//applying cast operator
		//byte b3 = (byte)b1 + b2;	CE: p l p
		//byte b3 = (byte)b1 + (byte)b2; CE: p l p => here we are converting byte to byte 
		byte b3 = (byte)(b1 + b2);

		System.out.println(i4);	//30
		System.out.println(b3);	//30

		char ch1 = 'a';
		char ch2 = 'b';
		//char ch3 = ch1 + ch2; CE: p l p
		//=>char ch3 = 'a' + 'b';
		//=>char ch3 = 97 + 98;
		//=>char ch3 = 195;

		int i5  = ch1 + ch2;
		char ch3  = (char)(ch1 + ch2);

		System.out.println(i5);
		System.out.println(ch3);

		//if we use literals in expression, and if those literals are of type int, compiler calculates expression and if that result is with in the range of destination type it allows assignment else throws CE: p l p
		byte b5 = 10 + 20;	

		//byte b6 = 127 + 1;	CE: p l p

		char ch4  = 'a' + 'b';

		
		//if we use literals and variables combination, compiler doesnot read value, only reads type. 
		//Hence it will not calculate and check result range, instead it check only type. 
		byte b6  = 1;
		//byte b7 = 1 + b6; CE: p l p
		//=>byte b7 = int + int; 
		//=>byte b7 = int; 

		
		//this is same case for other literals also.
		//It means if expression contians other than char or int literals, compiler checks only result type not range 
		//byte b7 = 1 + 2L; CE: p l p
		//=>byte b7 = int + long;
		//=>byte b7 = long + long;
		//=>byte b7 = long;

		float f11 = 10 + 20;
		
		//float f12 = 10 + 20.0; CE: p l p
		
			//=>float f12 = int + double;
			//=>float f12 = double + double;
			//=>float f12 = double;

		float f12 = 10 + 20.0f; 
			//=>float f12 = int + float;
			//=>float f12 = float + float;
			//=>float f12 = float;

		//we can not apply operation between incompatible types. It leads to CE
		int x  =  10;
		boolean bo = true;

		//int y = x + bo; CE: operator + cannot be applied to int,boolean
	}
}






