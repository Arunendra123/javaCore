//Student.java
class Student 
{
	int sno;
	String sname;
	int std;
	
	Student(int sno, String sname, int std)
	{
		this.sno		= sno;
		this.sname	= sname;
		this.std		= std;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		else if (obj instanceof Student)
		{
			Student s1 = (Student)obj;

			return (	this.sno == s1.sno && 
							this.sname  == s1.sname && 
							this.std == s1.std
						);
		}
		else 
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		return (sno + sname.length() + std);
	}

	public String toString()
	{
		return "sno: "+sno + "\n" +
					"name:" + sname +"\n" +
					"class: "+ std +"\n" ;
	}

















}