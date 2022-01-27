public class RelationalOperatorsDemo 
{
    public static void main(String args[])
   {
      int x = 10, y = 5;
	  /*
      System.out.println("x > y : "+(x > y));
      System.out.println("x < y : "+(x < y));
      System.out.println("x >= y : "+(x >= y));
      System.out.println("x <= y : "+(x <= y));
      System.out.println("x == y : "+(x == y));
      System.out.println("x != y : "+(x != y));
	 */	

      System.out.println(x > y);
      //System.out.println("x > y: "+ x > y);
      //=> System.out.println("x > y: "+ 10 > 5);
      //=> System.out.println("x > y: "+ "10" > 5);
      //=> System.out.println("x > y: 10" > 5);

		//System.out.println(x < y + x > y);
		//=>System.out.println(10 < 5 + 10 > 5);
		//=>System.out.println(10 < 15 > 5);
		//=>System.out.println(true > 5);

	//System.out.println((x < y) + (x > y));
	
	//=>System.out.println((10 < 5) + (10 > 5));
	//=>System.out.println((false) + (true));

	//System.out.println((x < y) + (x > y) + "");

	//=>System.out.println((10 < 5) + (10 > 5));
	//=>System.out.println((false) + (true) + "");


	System.out.println((x < y) + ""+ (x > y) );
	//=>System.out.println((10 < 5) + "" +(10 > 5));
	//=>System.out.println((false) + "" +(true));
	//=>System.out.println("false" + "" +(true));
	//=>System.out.println("false" + true);
	//=>System.out.println("false" + "true"));
	//=>System.out.println("falsetrue"));
	
	System.out.println(""+(x < y) +  (x > y) );



   }
  
}
