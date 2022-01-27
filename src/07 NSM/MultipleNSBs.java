class MultipleNSBs 
{
	{
		System.out.println("NSB1");		
	}

	MultipleNSBs()
	{
		System.out.println("no-arg Constructor");		
	}

	MultipleNSBs(String s)
	{
		System.out.println("String-arg Constructor");		
	}

	{
		System.out.println("NSB2");		
	}


	public static void main(String[] args) 
	{
		MultipleNSBs ms1	= new MultipleNSBs();
		System.out.println();		
		MultipleNSBs ms2	= new MultipleNSBs("abc");
	}
}
