abstract class AbstractMethod 
{
	public abstract void m1();
	abstract int m2();
	
	void m3()
	{
		m2();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
//		m2();
	}
}
