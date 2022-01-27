//VectorDemo.java
import java.util.Vector;

public class VectorDemo
{
	public static void main(String args[])
	{
		Vector v=new Vector();
			
		for(int i = 0 ; i <= 9 ; i++)
		{
			v.addElement(new Integer(i*10));
		}
		v.removeElementAt(0);
		v.removeElementAt(1);
		
		for(int i = 0 ; i < v.size() ; i++)
		{
			System.out.println(v.elementAt(i));
		}
	}
}
