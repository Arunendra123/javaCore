/*
- Create a custom thread with user define name
*/
class  MyThread extends Thread
{
	MyThread(String name)
	{
		super(name); // calling Thread(String name)
		System.out.println("In String-arg constructor");
	}	

	public void run()
	{
		System.out.println("In "+ getName() +" thread");
	}
}

class ThreadNameDemo
{

	public static void main(String[] args) 
	{
		MyThread 	mt1 = new 	MyThread("child1");
		mt1.start();

		MyThread 	mt2 = new 	MyThread("child2");
		mt2.start();

		System.out.println(mt1); //Thread[child1,5,main]
		System.out.println(mt2); //Thread[child2,5,main]
	}
}
