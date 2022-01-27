import java.awt.*;
import java.awt.event.*;

class TextKeyEventDemo extends Frame implements KeyListener
{
	Label l1;
	TextField tf1;

	TextKeyEventDemo()
	{
		setTitle("KeyEvent demo");
		setSize(500,500);
		setLayout(new FlowLayout());
		l1 = new Label("Enter text and press Enter key");


		tf1 = new TextField(20);

		add(l1);
		add(tf1);


		tf1.addKeyListener(this);
		
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent e)
	{
			if (e.getKeyCode() == KeyEvent.VK_ENTER)
			{
				System.out.println("In keyPressed");
				repaint();

			}
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}

	public void paint(Graphics g)
	{
		System.out.println("In paint");
		String text = tf1.getText();
		if (!text.equals(""))
		{
			g.drawString("You have entered: "+text,100, 100);
		}

		
	}
	public static void main(String[] args) 
	{
		new TextKeyEventDemo();
	}
}
