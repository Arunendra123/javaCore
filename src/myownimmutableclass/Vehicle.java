package myownimmutableclass;

// class should be final
// properties should be private
// properties should be final
// If we have to pass object reference as parameter for the class constructor, create deep copy.

public final class Vehicle {

	private final String name;
	private final int wheels;
	private final Engine engine;
	
	public Vehicle(String name, int wheels, Engine engine) {
		super();
		this.name = name;
		this.wheels = wheels;
		//deep copy(creating new object with all its values) instead passing same object
		this.engine = new Engine(engine.getName());
	}
	
	public String getName() {
		return name;
	}
	public int getWheels() {
		return wheels;
	}
	public Engine getEngine() {
		return engine;
	}
}


class Engine{
	private String name;
   
	Engine(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
