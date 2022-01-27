package Innerclasses;

class Outer{
	//Inner classes came in java 1.1 to fix GUI bugs. But It became more popular due to powerful feature.
	
	
	//If without existing one object, another object is not possible then inner classes are best suitable.
	 
	/* Example: 
	 * 
	 * Map        ---> Entry
	 * University ---> Department 
	 * Car        ---> Engine
	 * 
	 * There is no existence of engine without car.
	 * 
	 * 1. Without existing outer class object, there is not possibility of inner class object.
	 *    Relation between Inner Class and Outer Class is Has_A Relationship
	 *    
	 *    
	 *Type of Inner Classes:
	 *
	 *1: Normal and Regular Inner classes
	 *2: Method/Local
	 *3: Anonymous Inner 
	 *4: static nested classes
	 *
	 *
	 *1: Normal or Regular Inner class: 
	 *   The class inside a class called as normal or regular inner classes.
	 *   
	 *   Outer.class
	 *   outer$Inner.class
	 *   
	 */
	
	class RegularInnerClass {
		/*
		 * public static void main(String args[]) {
		 * System.out.println("Inner Classes:"); }        ->>>>>> Not Allowed
		 */
		
		/* Inside inner class declaration of static member are not allowed 
		 * But we can access the static and non-static members inside inner classes directly.
		 * */
		
		
		  public void m() {
		      System.out.println("Inner Classes: Instance Method"); 
		  }
	}
	
	int x=10;
	class RegularInnerClass_1 {
		  int x=100;
		  public void m() {
			  int x=1000;
		      System.out.println(x);                         // --> Local Variable
		      System.out.println(this.x);                    // --> Inner class variable
		      System.out.println(Outer.this.x);       // --> Outer class variable
		  }
	}
	
	//Outer class applicable modifiers are: 
	    // 1. public,
	    // 2. default,
	    // 3. final,
	    // 4. abstract,
	    // 5. strictfp
	//Inner class applicable modifiers are 
	    // 1. public,
		// 2. default,
		// 3. final,
		// 4. abstract,
		// 5. strictfp   +   private, protected, static
}

public class Introduction {
	public static void main(String args[]) {
	      System.out.println("Outer Classes:");
	      
	      //1....................................
	      Outer o=new Outer();
	      Outer.RegularInnerClass i=o.new RegularInnerClass();
	      i.m();
	      
	      //2....................................
	      new Outer().new RegularInnerClass().m();
	      
	      
	      //3..............................................
	      new Outer().new RegularInnerClass_1().m();
	}
}
