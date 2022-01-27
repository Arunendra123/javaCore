class MyThread extends Thread 
{
	public void run()
	{
		for (int i = 1; i <= 10 ; i++)
		{
			System.out.println("run: "+i);
		}
	}
	public static void main(String[] args) 
	{

		MyThread mt = new MyThread();
		//mt.start();
		System.out.println(mt);

		for (int i = 1; i <= 10 ; i++)
		{
			System.out.println("before thread creation main: "+i);
		}
	}
}