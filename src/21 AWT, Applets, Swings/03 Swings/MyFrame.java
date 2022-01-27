import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	Label l1, l2, l3;
	TextField tf1, tf2, tf3;
	Button b1, b2;

	MyFrame()
	{
		//setting frame default properties
		setTitle("MyFrame");
		setSize(500, 500);
		setLayout(new GridLayout(4,2));
		

		//component objects creation
		l1 = new Label("Enter first int number");
		l2 = new Label("Enter second int number");
		l3 = new Label("Result");

		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);

		b1 = new Button("Add");
		b2 = new Button("Clear");

		//adding componets to container
		add(l1);
		add(tf1);

		add(l2);
		add(tf2);

		add(l3);
		add(tf3);

		add(b2);
		add(b1);

		b1.addActionListener(this);
		b2.addActionListener(this);

		setVisible(true) ;
	}

	public void actionPerformed(ActionEvent e)
	{
		String buttonName = e.getActionCommand();
		if (buttonName.equals("Add"))
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());

			int c = a + b;

			tf3.setText(""+c);
		}
		else
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}

	}
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();
	

		System.out.println("Hello World!");
	}

};

