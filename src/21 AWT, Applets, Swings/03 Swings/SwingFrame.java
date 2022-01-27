import javax.swing.*;
import java.awt.*;

class  SwingFrame extends JFrame
{

	SwingFrame()
	{
		JButton b = new JButton("Button`");
		add(b);
		
		

		setLayout(new FlowLayout());	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new SwingFrame();
	}
}
