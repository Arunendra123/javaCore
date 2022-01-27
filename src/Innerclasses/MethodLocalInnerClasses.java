package Innerclasses;

public class MethodLocalInnerClasses {

	// The main purpose of method local inner classes is to use method specific repeatedly required functionality.
	// method local inner classes are best suitable to meet nested method functionality
	// scope of method local inner classes is very less. We use it very rarely.
	public static void main(String args[]) {
		Outer_2 o=new Outer_2();
		o.m();
		
		Outer_3 o1=new Outer_3();
		o1.m2();
	}
	
	// We can declare method local inner class inside both instance and static method
}

class Outer_2 {
	
	public void m() {

		class MethodLocalInnerClass{
			public int sum(int a,int b) {
			    return a+b;
			}
		}
		MethodLocalInnerClass m=new MethodLocalInnerClass();
		System.out.println("a+b="+m.sum(28,40));
		System.out.println("a+b="+m.sum(40,40));
		System.out.println("a+b="+m.sum(20,40));
	}
}

class Outer_3 {
	static int x=0;
	static int y=9;
	public void m() {
		class MethodLocalInnerClass{
			public int sum() {
			    return x+y;                   //----> we can access x and y directly but if m() is static we can't access instance
			}                                 //      variable
		}
		MethodLocalInnerClass m=new MethodLocalInnerClass();
		System.out.println("a+b="+m.sum());
	}
	
	
	public static void m1() {
		class MethodLocalInnerClass{
			public int sum() {
			    return x+y;                   //----> we can access x and y directly but if m() is static we can't access instance
			}                                 //      variable
		}
		MethodLocalInnerClass m=new MethodLocalInnerClass();
		System.out.println("a+b="+m.sum());
	}
	
	public void m2() {
		int s=20,t=30;
		class MethodLocalInnerClass {
			public int sum() {
			    return s+t;                  
			}                                
		}
		MethodLocalInnerClass m=new MethodLocalInnerClass();
		System.out.println("a+b="+m.sum());
	}
}