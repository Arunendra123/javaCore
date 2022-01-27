class MyThread implements  Runnable
{
	public void run()
	{
		System.out.println("In run");
	}
}

class RunnableDemo
{
	public static void main(String[] args) 
	{
		System.out.println("In main start");

		MyThread mt = new MyThread();
		//mt.start();

		Thread th1 = new Thread();
		th1.start();
		System.out.println("th1 => "+ th1);
		
		Thread th2 = new Thread(mt);
		th2.start();
		System.out.println("th2 => "+ th2);

		Thread th3 = new Thread(mt, "child");
		th3.start();
		System.out.println("th3 => "+ th3);

		System.out.println("In main end");
	}

};
