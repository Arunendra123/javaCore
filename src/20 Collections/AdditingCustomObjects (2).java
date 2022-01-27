//Sample.java
import java.util.*;

class  Example
{
	int x;
	Example(){}
	Example(int x){this.x = x;}
}
class AddingCustomObjects
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new Exampe());
		ts.add(new Exampe());
		ts.add(new Exampe(20));
	}
};
