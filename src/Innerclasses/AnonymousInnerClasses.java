package Innerclasses;

public class AnonymousInnerClasses {

	//sometime we can declare class without name, such type of inner classes are called anonymous inner class
	//The main purpose of ananymous inner classes is just for instant use (one time usese)
	
	/*Type:
		1. Anonymous Inner class that extends a class
		2. Anonymous Inner class that implements a interface
		3. Anonymous Inner class inside method arguments
    */
	
	//1. Anonymous Inner class that extends a class
	
	 Thread thread=new Thread() {
		
	 };             // ---> Anonymous that extends Thread class
	
	//2. Anonymous Inner class that implements a interface
	 
	 Runnable r=new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		} 
	 };            // ---> Anonymous that implements Runnable interface 
	 
	 
	 
	 
	 
	public static void main(String args[]) {
		//=================================================================
		//Without Anonymous class
		Parrent c=new Child();
		c.p();
		
		Parrent p=new Parrent() {
			public void p() {
				System.out.println("Child 1");
			}
		};
		p.p();
		
		Parrent p1=new Parrent() {
			public void p() {
				System.out.println("Child 2");
			}
		};
		p1.p();
		
		// AnonymousInnerClasses$1.class will be generated
	}
}


class Parrent {
	public void p() {
		System.out.println("Parent");
	}
}

class Child extends Parrent {
	public void p() {
		System.out.println("Child");
	}
}