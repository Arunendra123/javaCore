package Innerclasses;

public class AnonymousInnerClasses_1 {

	public static void main(String args[]) {
		
		Thread thread=new Thread() {
			
			@Override
			public void run() {
				for(int i=0;i<=10;i++) {
					System.out.println("Thread..."+i);
				}
			}
		};
		thread.start();
		
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<=10;i++) {
					System.out.println("Runnable..."+i);
				}
			}
		};

		Thread thread1=new Thread(runnable);
		thread1.start();
	}
	
	
	//3. Anonymous Inner class inside method
	Thread thread2=new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=0;i<=10;i++) {
				System.out.println("Runnable..."+i);
			}
			
		}
	});
}

