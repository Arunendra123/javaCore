package Innerclasses;

public class NestingOfInnerClasses {

	public static void main(String args[]) {
		Outer_1.Inner_0.Inner_1.Inner_2 i=new Outer_1().new Inner_0().new Inner_1().new Inner_2();
		i.m();
	}
}


class Outer_1 {
	class Inner_0{
		class Inner_1{
			class Inner_2{
				public void m() {
					System.out.print("Inner classes: Inner_2 ");
				}
			}
		}
	}
}
