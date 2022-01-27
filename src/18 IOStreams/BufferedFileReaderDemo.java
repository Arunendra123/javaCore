import java.io.*;

class BufferedFileReaderDemo
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("BankTransaction.java"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("BankTransaction_bak.java"));

		String s ;
		while ( br.ready())
		{
			s = br.readLine();
			
			bw.write(s);  //=> writes data to file

			System.out.println(s);	//=> writes data to console
		}
	}
}