class VariableSyntaxDemo{
	public static void main(String[] args){
		//definting a variable
		int x = 10;

		//declaring a variable
		int y;

		//initializing a variable
		y = 20;
		
		//accessing variables		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		//creating z variable, initializing it with an expression result
		//accessing x and y variables to execute the expression.
		int z = x + y;

		//accessing z variable
		System.out.println("z: "+z);

		//reinitialization
		x = 50;
		y = 60;
		z = 70;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		
		z = x  + y;
		System.out.println("x: "+x); //50
		System.out.println("y: "+y); //60
		System.out.println("z: "+z); //110


		x = y = z;
		System.out.println("x: "+x);  //110
		System.out.println("y: "+y);  //110
		System.out.println("z: "+z);  //110



	}
}
