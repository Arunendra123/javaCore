public class Student implements java.io.Serializable
{
	int whichClass;
	String name;
	
	public Student(int whichClass , String name)
	{
		this.whichClass	= whichClass;
		this.name			= name;		
	}

	public boolean equals(Object obj)
	{
		//below condition should be presented, else thereis a chance to get ClassCastException
		if(obj instanceof Student) 
		{
			Student s = (Student)obj;
			if ((whichClass == s.whichClass) && (name == s.name))
			{
				return true;
			}
		}
		return false;
	}

	public int hashCode()
	{
		return whichClass + name.length();
	}

	public String toString()
	{
		return whichClass+": "+name;
	}
}