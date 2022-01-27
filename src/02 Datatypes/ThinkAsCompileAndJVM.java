class ThinkAsCompileAndJVM 
{
	public static void main(String[] args) 
	{
		/*
		System.out.println(10);
		System.out.println('a');
		System.out.println("a");
		System.out.println(10.0);
		System.out.println(10.345f);
		System.out.println(30L);
		System.out.println(30l );

		System.out.println();
		System.out.println(50 + 20);

		int a = 30;
		int b = 40;
		int c = a  + b;
		System.out.println(c);
		System.out.println("The addition of " + a +" and " + b + " is " + c);

		=> System.out.println("The addition of " + 10 +" and " + 20 + " is " + 30);
		=> System.out.println("The addition of " + "10" +" and " + 20 + " is " + 30);
		=> System.out.println("The addition of 10" +" and " + 20 + " is " + 30);
		=> System.out.println("The addition of 10 and " + 20 + " is " + 30);
		=> System.out.println("The addition of 10 and " + "20" + " is " + 30);
		=> System.out.println("The addition of 10 and 20" + " is " + 30);
		=> System.out.println("The addition of 10 and 20 is " + 30);
		=> System.out.println("The addition of 10 and 20 is " + "30");
		=> System.out.println("The addition of 10 and 20 is 30");
		*/

//		int a = 30;
//		int b = 40;

//		System.out.println(a + b);				//70
//		System.out.println("a + b");			//a + b

	//	System.out.println("a + b"+a+b);	//a  + b3040
		//=>System.out.println("a + b"+30+40);	
		//=>System.out.println("a + b"+"30"+40);	
		//=>System.out.println("a + b30"+40);	
		//=>System.out.println("a + b30"+"40");	
		//=>System.out.println("a + b3040");	

//		System.out.println("a + b"+(a+b));	//a + b70
		//=>System.out.println("a + b"+(30+40));	
		//=>System.out.println("a + b"+(70));	
		//=>System.out.println("a + b"+70);	
		//=>System.out.println("a + b"+"70");	
		//=>System.out.println("a + b70");	

//		System.out.println(""+10 + 20);	//1020
//		System.out.println(10 + ""+ 20);	//1020
//		System.out.println(10 + 20 +"");	//30
		//=>System.out.println(30 +"");	
		//=>System.out.println("30" +"");	
		//=>System.out.println("30");	

		System.out.println(22/7 * 10 * 10);	
		//=>System.out.println(3 * 10 * 10);	
		//=>System.out.println(300);	

		System.out.println(22.0/7 * 10 * 10);	
		

	}
}
