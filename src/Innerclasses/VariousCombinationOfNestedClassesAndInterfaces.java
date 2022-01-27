package Innerclasses;

public class VariousCombinationOfNestedClassesAndInterfaces {

	public static void main(String args[]) {
		
	}
}

//1========================================================================================================
//Class Inside a class
//If without existing one object, another object is not possible then inner classes are best suitable.
class Unversity {
	class Department {
		
	}
}

//2========================================================================================================
// interface inside class
// if multiple implementation is required inside a class and all implementation is related to that class
class VehicleTypes{
	interface Vehicle{
		public int getVehicle();
	}
	
	class Car implements Vehicle{
		@Override
		public int getVehicle() {
			return 4;
		}
	}
	
	class Auto implements Vehicle {
		@Override
		public int getVehicle() {
			return 3;
		}
	}
}

//3=======================================================================================================
//interface inside interface
interface Map{
	public void m();
	interface Entry{
		public void m1();
	}
}

class MapImplementer_1 implements Map{

	@Override
	public void m() {
	  System.out.print("Map");
	}     // ----> m1() is not require to implements
	      // Whenever we are implementing Outer interface, inner interface method implementation is not require.
}

class MapImplementer_2 implements Map.Entry{

	@Override
	public void m1() {
	  System.out.print("Map");
	}     //----> m() is not require to implements
	      // Whenever we are implementing inner interface, outer interface method implementation is not require.
}


//4=========================================================================================================
// class inside interface
// If there is method inside a interface and method need argument of type class and that class is not going to use anywhere 
// in that case we can have a class inside interface.

interface EmailService{
	public void sendMail(EmailDetails details);
	
	class EmailDetails{
		String subject="";
		String emailTo="";
		String emailFrom="";
	}
}


interface Vehicle{
	public int getWheel();
	
	class DefualtVehicle implements Vehicle{
		@Override
		public int getWheel() {
			return 8;
		}
	}
}