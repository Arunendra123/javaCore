class ABSpecialCase //object pooling
{
	public static void main(String[] args) 
	{
		Integer io1 = 10;
		Integer io2 = 10;
		System.out.println(io1 == io2); //true

		Integer io3 = 128;
		Integer io4 = 128;
		System.out.println(io3 == io4); //false

		Character ch1 = 'a';
		Character ch2 = 'a';
		System.out.println(ch1 == ch2);//true

		Character ch3 = 254;
		Character ch4 = 254;
		System.out.println(ch3 == ch4); //false

		Long l1 = 10L;
		Long l2 = 10L;
		System.out.println(l1 == l2);//true

		Float f1 = 10f;
		Float f2 = 10f;

		System.out.println(f1 == f2); //false
	}
}