package p1;

class B 
{
	public static void main(String[] args) 
	{

		System.out.println("Test main");

		A a = new A();
		a.m1();
	}
}
/*
>javac -d . A.java
>javac -d . B.java
>java p1.B
Test main
A m1
*/
