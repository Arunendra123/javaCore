class MainThreadNameAndPriority 
{
	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();

		System.out.println(th.getName());
		System.out.println(th.getPriority());

		th.setName("My Cute main thread");
		th.setPriority(8);

		System.out.println(th.getName());
		System.out.println(th.getPriority());

		System.out.println(th);//Thread[My Cute main thread,8,main]
	}
}
