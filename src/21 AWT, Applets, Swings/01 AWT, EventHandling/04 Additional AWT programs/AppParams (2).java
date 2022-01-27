import java.awt.*;
import java.applet.*;
public class AppParams extends Applet implements Runnable{
   Thread t;
   String msg; int delay,x=600;
   public void init(){
      t=new Thread(this);
      msg=getParameter("msg");
delay=Integer.parseInt(getParameter("speed"));
    }//init closed
    public void start(){
     t.start(); //calling run() of thread
    }
    //thread  run
    public void run(){
       while(true){
           repaint(); //calls paint
            x-=10;
          try{ Thread.sleep(delay); 
          }catch(InterruptedException e){}
            if(x<=0) x=600;
      }//while
    }//run
   public void paint(Graphics g){
     g.setFont(new Font("Impact",Font.PLAIN,22));
     g.drawString(msg,x,100);
    }//paint closed
}//class closed