class NSMObject 
{
	int x = 10;
	int y = 20;

	void m1()
	{
		//will be accessed from current object
		System.out.println("x: "+x);    //=>Sopln(this.x);
		System.out.println("y: "+y);   //=>Sopln(this.y);

		NSMObject	no = new NSMObject();
		//will be accessed from above object
		System.out.println("no.x: "+no.x);    
		System.out.println("no.y: "+no.y);   
	}

	public static void main(String[] args) 
	{
		//first object
		NSMObject no1 = new NSMObject();
		no1.x	= 50;
		no1.y	= 60;

		System.out.println("x, y values from m1() with no1 object");
		no1.m1(); //=> 50 60 & 10 20

		//second object
		NSMObject no2 = new NSMObject();
		no2.x	= 70;
		no2.y	= 80;

		System.out.println("\nx, y values from m1() with no2 object");
		no2.m1(); //=> 70 80 & 10 20

	}
}
