class ArrayCast 
{
	public static void main(String[] args) 
	{
//		double[] d = new int[1];
//		Example[] e = new Sample[3];

	//	Example e = new Example[0];
		Object obj = new Object[0];

		int[][] i = {new int[5],null};
		System.out.println(i[1].length);
	}
}

class Example{}
class Sample extends Example{}