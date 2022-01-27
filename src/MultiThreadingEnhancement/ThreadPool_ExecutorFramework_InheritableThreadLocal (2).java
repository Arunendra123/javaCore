package MultiThreadingEnhancement;

public class ThreadPool_ExecutorFramework_InheritableThreadLocal {
	public static void main(String args[]) {
		
		////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		ParentThread_1 p=new ParentThread_1();
		p.start();
	
	}
}


class ParentThread_1 extends Thread {
	
	static InheritableThreadLocal l=new InheritableThreadLocal() {
		@Override
		public Object childValue(Object o) {
			return "ChildThread";	
		}
	};
	
	@Override
	public void run() {
		System.out.println("ParrentThread: "+l.get());
		l.set("ParentThread");
		System.out.println("ParrentThread: "+l.get());
		
		ChildThread_1 c=new ChildThread_1();
		c.start();
	}
}

class ChildThread_1 extends Thread {
	
	@Override
	public void run() {
		System.out.println("ParrentThread: "+ParentThread_1.l.get());
		//it return null if want the parentvalue we should go for InheritableThreadLocal class
	}
}





