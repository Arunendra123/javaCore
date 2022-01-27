package MultiThreadingEnhancement;

public class ThreadGroupTest
{
	public static void main(String args[])
	{
		//Every Thread in java belongs to some group. Main thread belongs to MainThread group and MainThread belongs to 
		// system group. system group is root group for all the thread.
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//                            system
		//                               |
		//     ----------------------------------------------------------
		//    |          |               |               |              |
		//  Main     Finalizer     Attach Listener  Reference Handler  Signal Dispatcher
		//
		// ThreadGroup is a java class present in java.lang package and it direct child of object class.
		//    Object
		//      |
		//  ThreadGroup
		//
		// ThreadGroup constructor is given below and it creates a new threadGroup with specify group name and name of parent group is 
		// currently executing group.
		ThreadGroup g1=new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());
		System.out.println(g1.getName());
		//
		//
		// Second constructor
		ThreadGroup g2=new ThreadGroup(g1,"Second Group");
		System.out.println(g2.getParent().getName());
		// Now parent of second group is first group because it is executing fist group.
		//
		// ThreadGroup class methods
		ThreadGroup g3=new ThreadGroup("Name");
		System.out.println(g3.getName());                                     //it returns name of the thread group
		System.out.println(g3.getMaxPriority());                              //it returns priority of the group
		                   g3.setMaxPriority(Thread.MIN_PRIORITY);            //it set the priority of group and default priority of ThreadGroup is 5
		System.out.println(g3.getMaxPriority());
		System.out.println(g3.getParent());                                   // it returns parentGroup of current thread
		                   g3.list();                                         // it list information about thread on console
		System.out.println(g3.activeCount());                                 // return no of active thread present in the thread group
	    System.out.println(g3.activeGroupCount());                            //it return no of active group present in current ThreadGroup
	    Thread[] t=new Thread[10];
	                       g3.enumerate(t);                                   //it will copy all active thread to the array present in ThreadGroup
	    ThreadGroup[] t1=new ThreadGroup[10];
	                       g3.enumerate(t1);                                  //it will copy all active subThreadGroup to the array present in ThreadGroup
        System.out.println(g3.isDaemon());
                           g3.setDaemon(true);
                           g3.interrupt();                                    //interrupt all waiting and sleeping thread present in ThreadGroup     
                           g3.destroy();
                           
                           
                           
                           
      ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
      Thread[] th=new Thread[system.activeCount()];
      system.enumerate(th);
      System.out.println("All Active ThreadGroup : ");
      for(Thread th1:th)
      {
    	  System.out.println(th1.getName()+", Deamon: "+th1.isDaemon());
      }
      
      
	}
	
	//https://www.geeksforgeeks.org/java-lang-threadgroup-class-java/

}
