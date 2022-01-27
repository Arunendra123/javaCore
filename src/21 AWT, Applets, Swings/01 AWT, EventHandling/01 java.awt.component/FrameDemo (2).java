import java.awt.*;
import java.awt.event.*;


public class FrameDemo extends Frame implements ActionListener
{
	Button b1,b2;
	TextField tf1,tf2,tf3;
	Label l1,l2,l3;

	Font f=new Font("Arial",Font.BOLD,26);
	
	FrameDemo(String name)
	{
		super(name);
		
		setSize(500,500);
		setLayout(new FlowLayout());
		setFont(f);
		setBackground(Color.black);
		setForeground(Color.red);

		b1=new Button("add");
		b2=new Button("cancel");

		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);

		l1=new Label("Enter first Int value");
		l2=new Label("Enter second Int value");
		l3=new Label("Result value");

		add(l1);
		add(tf1);

		
		add(l2);
		add(tf2);
		
		add(l3);
		add(tf3);

		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);

		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int  add=(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText()));

			tf3.setText(""+add);
		}
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
	public static void main(String[] args) 
	{
		new FrameDemo("FrameDemo");
	}
}