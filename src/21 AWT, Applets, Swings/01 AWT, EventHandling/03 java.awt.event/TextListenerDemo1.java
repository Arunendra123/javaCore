/* TextListenerDemo1.java */

import java.awt.*;
import java.awt.event.*;

class TextListenerDemo1 extends Frame implements TextListener {

	Label l1, l2;
	TextArea ta1, ta2;
	Font f;
	String str;

	TextListenerDemo1() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		setTitle("TextListener Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		l1 = new Label("Enter Text:     ");
		l2 = new Label("Re-enter Text:");

		ta1 = new TextArea("", 5, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta1.addTextListener(this);

		ta2 = new TextArea("", 5, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);

		add(l1);
		add(ta1);
		add(l2);
		add(ta2);

		setSize(300, 250);
		setVisible(true);

	}

	public void textValueChanged(java.awt.event.TextEvent te) {

		if(te.getSource() == ta1) {

			str = ta1.getText();
			ta2.setText(str);
		}
	}

	public static void main(String args[]) {
		new TextListenerDemo1();
	}
}