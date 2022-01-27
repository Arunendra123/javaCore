/*
Interthread communication
*/
class BankTransaction
{
	int money;

	synchronized int withDrawMoney()
	{
		System.out.println("Money Withdrawal:"+money);
		return money;
	}
	synchronized void depositMoney(int money)
	{
		this.money=money;
		System.out.println("Deposited Money:"+money);
	}
}//BankTransaction
class Depositer implements Runnable
{
	BankTransaction bt;

	Depositer(BankTransaction bt)
	{
		this.bt=bt;
		new Thread(this,"Depositer").start();
	}
	
	public void run()
	{
		int i=0;
		while(i<10)
		{
			bt.depositMoney(i++);

		}//while
	}//run
}//depositer

class WithDrawer implements Runnable
{
	BankTransaction bt;
	WithDrawer(BankTransaction bt)
	{
		this.bt=bt;
		new Thread(this,"WithDrawer").start();
	}
	public void run()
	{
		int i=0;
		while(i<10)
		{
			bt.withDrawMoney();
			i++;
		}//while
	}//run
}//WithDrawer

class InterThreadComunication
{
	public static void main(String[] args) 
	{
		BankTransaction bt=new BankTransaction();
		new Depositer(bt);
		new WithDrawer(bt);


		System.out.println("I am CM so I'll Strart first");
	}
}
