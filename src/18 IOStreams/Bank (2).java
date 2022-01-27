class Bank implements java.io.Serializable
{
	private long accNo;
	private String accHName;
	private String username;
	private transient String password;
	private transient double balance;

	static double minBalance = 5000;

	Bank()
	{
		System.out.println("Bank Constructor");
	}
	
	public void setAccNo(long accNo)
	{
		this.accNo = accNo;
	}
	public long getAccNo()
	{
		return accNo;
	}

	public void setAccHName(String accHName)
	{
		this.accHName = accHName;
	}
	public String getAccHName()
	{
		return accHName;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		return username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return password;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;

		minBalance = balance;
	}
	public double getBalance()
	{
		return balance;
	}

	public String toString()
	{
		return "accNo: "+accNo +"\n" +
					"accHName: "+accHName +"\n" +
					"username: "+username+"\n" +
					"password: "+password+"\n"+
					"balance: "+balance+"\n"+
					"minBalance: "+minBalance+"\n";
	}
}