class LocalPreference 
{
	static int a =10;
	static int b =20;

	public static void main(String[] args) 
	{
		System.out.println(a);  //10 
		System.out.println(b);  // 20

		int a = 50;
		System.out.println(a);  //10 
		System.out.println(LocalPreference.a);  // 20
		System.out.println(b);  // 20

		
	}
}