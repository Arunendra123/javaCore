import p1.A;
import p2.B;

import static p1.A.*;
import static p2.B.*;

class Test 
{
	public static void main(String[] args) 
	{
		m2();
		m3();
		//m1(); //CE: reference to m1 is ambiguous

		//accessing m1() with its fully qulified name
		A.m1();
		B.m1();
	}
}
