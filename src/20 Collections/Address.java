public class Address implements java.io.Serializable
{
	private int streetNo;
	private int flatNo;
	private String city;

	public Address(int streetNo, int flatNo, String city)
	{
		this.streetNo	= streetNo;
		this.flatNo		= flatNo;
		this.city			= city;
	}

	public String toString()
	{
		return "\nstreetNo: "+streetNo +
					" \nflatNo: "+flatNo +
					" \ncity: "+city; 
	}
}
