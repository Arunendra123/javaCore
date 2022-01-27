/*
  *SetClassesDemo.java
  *
  * The below program explains all Set implemented concrete classes, and their functionality, 
  * rules, exceptions.
 */
	
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesDemo  
{
	public static void main(String[] args) 
	{
		HashSet	hs	= new HashSet();
		LinkedHashSet	lhs	= new LinkedHashSet();
		TreeSet		ts	= new TreeSet();
		
		//printing inital size of collection objects
		System.out.println("hs 	length: "+hs.size()); //0
		System.out.println("lhs	length: "+lhs.size());//0
		System.out.println("ts 	length: "+ts.size());//0
		
		System.out.println();
/*		
		//adding elements to hs
		System.out.println("is 20 added: "+hs.add( Integer.toString(20)));	//true
		System.out.println("is a added: "+hs.add(new Character('a')));			//true
		System.out.println("is Example added: "+hs.add(new Example()));	//true
		System.out.println("is b added: "+hs.add(new Character('b')));			//true
		System.out.println("is abc added: "+hs.add("abc"));							//true
		System.out.println("is Abc added: "+hs.add("Abc"));							//true
		System.out.println("is abc added: "+hs.add("abc"));							//false
		System.out.println("is abc added: "+hs.add(new String("abc")));		//false
		
		//adding nulls to hs
		System.out.println("is null added: "+hs.add(null));								//true
		System.out.println("is null added: "+hs.add(null));								//false
			
		System.out.println();

		//printing hs modified size and elements
		System.out.println(hs.size());																		//7
		System.out. println("hs : " + hs);												//[null, 20, abc, b, Example@addbf1, Abc, a]


		//adding elements to lhs	
		System.out.println("is 20 added: "+lhs.add( Integer.toString(20)));	//true
		System.out.println("is a added: "+lhs.add(new Character('a')));		//true
		System.out.println("is Example added: "+lhs.add(new Example()));	//true
		System.out.println("is b added: "+lhs.add(new Character('b')));		//true
		System.out.println("is abc added: "+lhs.add("abc"));							//true
		System.out.println("is Abc added: "+lhs.add("Abc"));							//true
		System.out.println("is abc added: "+lhs.add("abc"));							//false
		System.out.println("is abc added: "+lhs.add(new String("abc")));	//false

		//adding nulls to lhs
		System.out.println("is null added: "+lhs.add(null));								//true
		System.out.println("is null added: "+lhs.add(null));								//false

		System.out.println();

		//printing lhs modified size and elements
		System.out.println(lhs.size());																		//7
		System.out. println("lhs : " + lhs);										//[20, a, Example@42e816, b, abc, Abc, null]
*/			
		//adding elements to ts
		System.out.println("is abc added: "+ts.add("abc"));						//true
		System.out.println("is xyz added: "+ts.add("xyz"));							//true
		System.out.println("is bbc added: "+ts.add("bbc"));						//true
		System.out.println("is pqr added: "+ts.add(new String("pqr")));	//true
		System.out.println("is 10 added  : "+ts.add(Integer.toString(10)));//true

		//adding heterogenious element
		//System.out.println("is Integer added: "+ts.add(new Integer(10))); //RE: CCE

		//adding nulls to ts
		//System.out.println("is null added: "+ts.add(null));	//RE: NPE
		//System.out.println("is null added: "+ts.add(null));	//RE: NPE

		System.out.println();

		//printing ts modified size and elements
		System.out.println(ts.size());				//5
		System.out. println("ts : " + ts);		//  [10, abc, bbc, pqr, xyz]

		//when can we add nulls to TreeSet 
		//If it is solo TreeSet we can add nulls, check the below code
		TreeSet solots 	= new TreeSet();
		solots.add(null);

		System.out.println(solots.size());				//1
		System.out. println("solots : " + solots);	//[null]

	}
}
class Example{}
