import java.io.*;

class BankTransaction 
{
	public static void main(String[] args) throws Exception
	{
		Bank acc1 = new Bank();

		acc1.setAccNo(1);
		acc1.setAccHName("Hari");
		acc1.setUsername("HariKrishna");
		acc1.setPassword("ReflectionTechnologies");
		acc1.setBalance(999999999);

		System.out.println(acc1);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankAccountsinfo.ser"));

		oos.writeObject(acc1);

		System.out.println("Object written to file");

	}
}