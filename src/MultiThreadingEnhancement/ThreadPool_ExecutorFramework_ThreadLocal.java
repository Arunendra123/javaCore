package MultiThreadingEnhancement;

public class ThreadPool_ExecutorFramework_ThreadLocal {
	/*
	 * ThreadLocal class provides ThreadLocal variables , ThreadLocal class maintain values per thread basis, 
	 * ThreadLocal object maintain separate value for each thread like userId, tansactionId.
	 * 
	 *  Thread can access its local value, can manipulated its value and even can remove its value
	 *  In every part of the code which is executed by the thread, we can access its local variables.
	 *  
	 *  Example: Consider a Servlet which invokes some business methods we have a request to generate a unique transaction id for each and every request and we have to pass this transaction id to the business method for this requirement we can use ThradLocal
	 *           to maintain a separate transaction id that is for very thread.
	 */
	
	public static void main(String args[]) {
		
		ThreadLocal threadlocal=new ThreadLocal() {
			
			@Override
			public Object initialValue() {
				return "Dheeru";
			}
		};

		//threadlocal.get();
		//threadlocal.withInitial();
		//threadlocal.set();
		//threadlocal.removed();
		
		//It works for current thread where these method get executed
		System.out.println(threadlocal.get());
		threadlocal.set("Arunendra");
		System.out.println(threadlocal.get());
		threadlocal.remove();
		System.out.println(threadlocal.get());
		
		////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		ParentThread p=new ParentThread();
		p.start();
		
	}
}


class ParentThread extends Thread {
	
	static ThreadLocal l=new ThreadLocal();
	@Override
	public void run() {
		System.out.println("ParrentThread: "+l.get());
		l.set("Parent");
		System.out.println("ParrentThread: "+l.get());
		
		ChildThread c=new ChildThread();
		c.start();
	}
}

class ChildThread extends Thread {
	
	static ThreadLocal l=new ThreadLocal();
	@Override
	public void run() {
		System.out.println("ParrentThread: "+ParentThread.l.get());
		//it return null if want the parentvalue we shold go for InheritableThreadLocal class
	}
}





