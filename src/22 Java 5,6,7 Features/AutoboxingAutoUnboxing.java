class AutoboxingAutoUnboxing 
{
	public static void main(String[] args) 
	{
		Integer io1 = new Integer(10);
		Integer io2 = 10;

		int a = new Integer(10);
		//Integer io = 10;
		//System.out.println(a);

		//Double d = 10; CE:

		//Integer io = 'a';

		Byte b1 = 10;

		//Byte b2 = 128; CE:

		Character ch = 97;

		//DWC
		//====
		Integer io1 = 10;
		Integer io2 = 20;

		Integer io3 = io1 + io2;
		System.out.println(io3);



	}
}
