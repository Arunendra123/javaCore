class ToStringDemo{
	public static void main(String[] args){
		Thread th1 = new Thread();
		System.out.println(th1);

		System.out.println();
		Thread th2 = new Thread();
		System.out.println(th2);

		Thread th3 = Thread.currentThread();
		System.out.println();
		System.out.println(th3);

		th3.setPriority(7);

		System.out.println();
		Thread th4 = new Thread();
		System.out.println(th4);
	}
}