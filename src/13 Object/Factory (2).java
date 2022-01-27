class Byke implements Cloneable
{
	int bykeNumber;
	int engineNumber;
	int modelNumber;
	String type;
	
	Byke(int engineNumber, int modelNumber, String type)
	{
		this.engineNumber = engineNumber;
		this.modelNumber  = modelNumber;
		this.type = type;
	}

	public Object  clone() throws CloneNotSupportedException
	{
		//current byke object is cloned
		Byke b1 = (Byke)super.clone();

		//changing individual property
		b1.engineNumber = b1.engineNumber + 10;
		
		//returning cloned byke	
		return b1;
	}
}

class  Factory
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Byke b1 = new Byke(4221, 5673, "Pulsar 180CC");
		
		//cloning first byke object
		Byke b2 = (Byke) b1.clone();

		//clone method creates new object, so == returns false
		System.out.println(b1 == b2);

		System.out.println("b1 object state");
		System.out.println("b1.engineNumber: "+ b1.engineNumber);
		System.out.println("b1.modelNumber: "+ b1.modelNumber);
		System.out.println("b1.type: "+ b1.type);

		System.out.println();
		System.out.println("b2 object state");
		System.out.println("b2.engineNumber: "+ b2.engineNumber);
		System.out.println("b2.modelNumber: "+ b2.modelNumber);
		System.out.println("b2.type: "+ b2.type);
	
	}
}
