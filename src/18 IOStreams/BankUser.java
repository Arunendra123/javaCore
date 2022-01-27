import java.io.*;

class BankUser 
{
	public static void main(String[] args) throws Exception
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankAccountsinfo.ser"));

		Bank accDetails = (Bank) ois.readObject();

		System.out.println(accDetails.getAccHName() + " details");
		System.out.println(accDetails);
	}
}
