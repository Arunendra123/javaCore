class MyThread extends Thread
{
	String name;
	
	MyThread(String name)
	{
		this.name = name;
	}

	public void run()
	{
		for (int i = 1 ; i < 10  ; i++ )
		{
			System.out.println("In "+ name +" thread: "+i);
		}

	}

}
class ThreadWithCurrentState 
{
	public static void main(String[] args) 
	{
		MyThread mt1 = new MyThread("First");
		MyThread mt2 = new MyThread("Second");

		mt1.start();
		mt2.start();

	}
}
