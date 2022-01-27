class SwitchDemo 
{
	static void m1(int a)
	{
		System.out.println("before switch");
		
		switch(a)
		{
			case 1:			
				System.out.println("in case1 start");
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in case 1 end");

			case 2:
				System.out.println("in case 2 start");			
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in case 2 end");
				break;

			case 3:
				System.out.println("in case 3 start");			
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in case 3 end");
				break;

			 default :
				System.out.println("in default start");			
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in default end");
		}

		System.out.println("after switch");
	}
	public static void main(String[] args) 
	{
		//m1(1); 
		/*
		there is no break in case 1: hence case 1: and case 2: both will be executed

		before switch
		in case1 start
		in switch
		in switch
		in case 1 end
		in case 2 start
		in switch
		in switch
		in case 2 end
		after switch
		*/

		//m1(2); 
		/*
		before switch
		in case 2 start
		in switch
		in switch
		in case 2 end
		after switch
		*/
		m1(20); 
		m1(30); 
		/*
		before switch
		in default start
		in switch
		in switch
		in default end
		after switch
		*/
	}
}