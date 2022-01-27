class Employee 
{
	int eid;
	String ename;
	
	Employee(int eid, String ename)
	{
		this.eid		= eid;
		this.ename = ename;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		else
		{
			 if (obj instanceof Employee)
			 {
				 Employee emp = (Employee)obj;

				 return this.eid == emp.eid &&
							 this.ename.equals(emp.ename); 	
			 }
			 else
			{
				 return false;
			 }
		}
	}

	public int hashCode()
	{
		//some hashing algoritham to generate hash code based on current object state. 
		int size	= ename.length();
		int result = 1;
		
		for (int i = 0 ; i < size ; i ++ )
		{
			result = result ^ (ename.charAt(i) * i) ;
		}

		return eid ^ result;
	}
			
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "Hari");
		Employee e2 = new Employee(2, "Krishna");
		Employee e3 = new Employee(1, "Hari");
		Employee e4 = new Employee(1, "Hair");

	
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() == e2.hashCode());

		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode() == e3.hashCode());

		System.out.println(e3.equals(e4));
		System.out.println(e3.hashCode() == e4.hashCode());

	}
}
