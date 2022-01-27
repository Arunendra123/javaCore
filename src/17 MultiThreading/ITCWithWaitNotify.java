/* InterThread communication using wait() and notify() */
//Factory.java
class Factory
{
	int items;
	boolean itemsInFactory;

	synchronized void produce(int items)
	{
		if(itemsInFactory)
		{
			
			try{		
				this.wait();	
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
		}

		this.items			= items;
		itemsInFactory	=	true;

		System.out.println("produced items:"+items);
		
		notify();
	}//produce

	int consume()
	{
		if(!itemsInFactory)
		{
			try{
				wait();
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}			
		}

		System.out.println("items comsumed:"+items);
		
		itemsInFactory=false;
		
		notifyAll();
		
		return items;
	}
}

//Producer.java
class Producer implements Runnable
{
	Factory fa;

	Producer(Factory fa)
	{
		this.fa	=	fa;
		new Thread(this,"Producer").start();
	}
	
	public void run()
	{
		int i	=	1;

		while( i <= 10)
		{
			fa.produce(i++);
		}
	}
}

//Consumer.java
class Consumer implements Runnable
{
	Factory fa;
	Consumer(Factory fa)
	{
		this.fa = fa;
		new Thread(this , "Consumer").start();
	}
	public void run()
	{
		int i = 0;
		while(i < 10)
		{
			fa.consume();
			i++;
		}//while
	}//run
}//Consumer

//ITCWithWaitNotify.java
public class ITCWithWaitNotify
{
	public static void main(String[] args) 
	{
		Factory bajaj = new Factory();

		new Producer(bajaj);
		new Consumer(bajaj);

	}//main
}//class