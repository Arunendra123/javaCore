//MultipleClasses.java
class A
{
}

class B
{
    static void m1()
   {
       System.out.println("B m1()");
   }	
}
class C
{
    static void m2()
   {
       System.out.println("C m2()");
   }
   public static void main(String[] args)		
   {
      System.out.println("C main()");	
   }	
}

class D
{
    static void m3()
   {
       System.out.println("D m3()");
   }
   public static void main(String[] args)		
   {
      System.out.println("D main()");
      m3();			
   }
    static void m4()
   {
       System.out.println("D m4()");
   }
}

class E
{
   static void m5()
  {
      System.out.println("E m5");	
  }
  public static void main(String[] args)
  {
      System.out.println("E main");	 
      m5();

      //m1(); CE: cannot find symbol
      B.m1();				
      C.m2(); 
      D.m3();
      D.m4();	

  }
}
/*
Compilation:
.\01basics>javac MultipleClasses.java
		|_A.class
		|_B.class
		|_C.class
		|_D.class
		|_E.class
Execution:
.\01basics>java A
Exception in thread "main" java.lang.NoSuchMethodError: main

.\01basics>java B
Exception in thread "main" java.lang.NoSuchMethodError: main

.\01basics>java C
C main()

.\01basics>java D
D main()
D m3()

.\01basics>java E
E main()
E m5()
B m1()
C m2()
D m3()
D m4()

01 basics>javac F.java
javac: file not found: F.java

=>
\01basics>java F
Exception in thread "main" java.lang.NoClassDefFoundError: F

*/





















