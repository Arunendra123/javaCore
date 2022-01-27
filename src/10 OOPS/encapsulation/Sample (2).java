class Sample 
{
	public static void main(String[] args) 
	{
		Example e = new Example();
		e.a = 50;
		//System.out.println(e.a);

		e.setA(50);
		System.out.println(e.getA());


		e.setA(-6);
		System.out.println(e.getA());

	}
}
