class NativeMethods 
{
	native void m1();
	static native void m2();
	final native void m3();

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m2();
	}
}
