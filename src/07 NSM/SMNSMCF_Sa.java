class Sample 
{
	static int c = m5();

	static 
	{
		System.out.println("Sample SB1");
	}
	
	static int d = m6();

	static 
	{
		System.out.println("Sample SB2");
	}

	int p = m7();
	
	{
		System.out.println("Sample NSB1");
	}

	int q = m8();
	
	{
		System.out.println("Sample NSB2");
	}
	
	Sample()
	{
		System.out.println("Sample no-arg constructor");
	}

	Sample(int i)
	{
		System.out.println("Sample int-arg constructor");
	}

	static int m5()
	{
		System.out.println("Sample m5 : c");
		return 50;
	}
	static int m6()
	{
		System.out.println("Sample m6 : d");
		return 60;
	}

	int m7()
	{
		System.out.println("Sample m7 : p");
		return 70;
	}

	int m8()
	{
		System.out.println("Sample m8 : q");
		return 80;
	}

	public static void main(String[] args) 
	{
			System.out.println("Sample main");

			//------
			//------
			//------
	}
}

class SMNSMCF_Sa
{
};
/*
Q1.  What is the output if we execute the program as it is															> java Sample
Q2.  What is the output if we place sample object creation statement at blank lines			> java Sample
Q3.  What is the output if we place Exmple object creation statement at blank lines			> java Sample
Q3.  What is the output if we place both classes object creation statement at blank lines	> java Sample
*/