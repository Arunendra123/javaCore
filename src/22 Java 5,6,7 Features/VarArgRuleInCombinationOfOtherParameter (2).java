class VarArgRuleInCombinationOfOtherParameter 
{
	void m1(int... a){}
	//void m1(int... a, float... b){} CE:

	void m1(int a, int... b){}
 //	void m1(int a, int... b, int c){}	CE 


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
