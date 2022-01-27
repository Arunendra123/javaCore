//Prg demon. Inner class
class Outer{
     int x=1;
    void showInner(){
     Inner i=new Inner();
     i.showY(); 
     i.showOuterX();
      }
      void showX(){
System.out.println("x="+x);
      }
     class Inner{ 
         int y=10;
        void showY(){
System.out.println("Inner Y="+y);
          }
         void showOuterX(){
System.out.println("Outer X="+x);//direct access to x of outer class
         }
     }
}
public class InnerClassDemo{
  public static void main(String args[]){
//    Inner i=new Inner(); not accessible outside Outer class.
Outer o=new Outer();
o.showX();
o.showInner();
 }
}