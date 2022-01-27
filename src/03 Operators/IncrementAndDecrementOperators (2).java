/*
++ : is called as increment operator because it increaments variable value by 1
--	  : is called as increment operator because it decreses variable value by 1

we use these operators either before or after variable.
Prefix increment/ decrement operators
============================
If we use these operators before variable, they are called prefix operators.

Postfix increment/ decrement operators
============================
If we use these operators after variable, they are called postfix operators.

Difference:
========
If use them as prefix operators, JVM first increaments / decrements its value then JVM uses the current value in the expression.

If use them as postfix operators, JVM first uses the current value then it increaments / decrements that variable value.
*/

//IncrementAndDecrementOperators.java
class IncrementAndDecrementOperators 
{
	public static void main(String[] args) 
	{
		int a = 10;
		a++;
		System.out.println(a);//11

		int b = 20;
		++b ;
		System.out.println(b);//21
		System.out.println();
		/*
		Note: we cannot observe the difference in prefix and postfix operators if we donot use the value at the same statement or line.
		
		check the below code, you can find the difference in both operators
		*/

		int x = 30;
		System.out.println(x++);
		System.out.println(x);

		System.out.println();

		int y = 40;
		System.out.println(++y);
		System.out.println(y);

		System.out.println();
		
		int z = 5;
		System.out.println(z++ + ++z + --z + z-- + z - z-- +z);

	}
}
