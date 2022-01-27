class Sample 
{
	void m1(byte a)
	{
		System.out.println("byte-arg");
	}

	void m1(float f)
	{
		System.out.println("float-arg");
	}

	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.m1((byte)10);  //=> s.m1(int);
		s.m1(34.67f);  //=> s.m1(float);

		s.m1(20L);	 //=>s.m1(long);
		s.m1('a');	 //=>s.m1(char);
	}
}
