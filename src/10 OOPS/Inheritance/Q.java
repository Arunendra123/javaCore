class Q //extends P
{
	public static void main(String[] args) 
	{
		P p = new P();

		p.m1();
		System.out.println("P.a:"+p.a);
		System.out.println("P.b:"+p.b);
		System.out.println();

		p.a = 40;
		//p.b = 50; //CE: cannot assign a value to final variable b
		System.out.println("P.a:"+p.a);
		System.out.println("P.b:"+p.b);
	}
}
