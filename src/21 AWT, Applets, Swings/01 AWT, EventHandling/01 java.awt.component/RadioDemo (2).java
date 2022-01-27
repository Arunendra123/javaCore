/*
 * RadioDemo.java
 * This program demonstrates Radio Button.

	Checkbox Class Constructors:
	- public Checkbox();
	- public Checkbox(String label);
	- public Checkbox(String label, boolean state);
	- public Checkbox(String label, boolean state, CheckboxGroup g);
	- public Checkbox(String label, CheckboxGroup g,boolean state);
*/
import java.awt.*;

class RadioDemo extends Frame {

	Checkbox r1, r2, r3;
	Font f;

	RadioDemo() 
	{

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("Radio Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		CheckboxGroup chg = new CheckboxGroup();

		r1 = new Checkbox("Red", true, chg);
		r2 = new Checkbox("Green", chg, false);
		r3 = new Checkbox("Blue", false, chg);

		add(r1);
		add(r2);
		add(r3);

		setSize(400, 150);
		setVisible(true);
	}
	public static void main(String args[]) {
		new RadioDemo();
	}
}