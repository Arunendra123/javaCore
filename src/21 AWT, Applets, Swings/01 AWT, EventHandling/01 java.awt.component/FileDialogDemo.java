/*
 * FileDialogDemo.java
 * This program demonstrates FileDialog creation.
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;

class FileDialogDemo extends Frame implements ActionListener {

	TextArea ta;
	Button b1, b2, b3;
	FileDialog dlg;
	Font f;
	String strFileName, str;

	FileDialogDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("FileDialog Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		ta = new TextArea(15, 60);

		b1 = new Button("Open");
		b1.addActionListener(this);

		b2 = new Button("Save");
		b2.addActionListener(this);

		b3 = new Button("Exit");
		b3.addActionListener(this);

		add(ta);
		add(b1);
		add(b2);
		add(b3);

		setSize(450, 350);
		show();

	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b1) {

			dlg = new FileDialog(this, "Open", FileDialog.LOAD);
			dlg.show();
			try {

				strFileName = dlg.getDirectory() + "\\" + dlg.getFile();
				FileReader fr = new FileReader(strFileName);
				BufferedReader br = new BufferedReader(fr);
				ta.setText("");
				while((str = br.readLine()) != null) {

					ta.append(str + "\n");
				}
			}
			catch(Exception e) {
				System.out.println("Exception: " + e);
			}
		}

		if(ae.getSource() == b2) {

			dlg = new FileDialog(this, "Save", FileDialog.SAVE);
			dlg.show();
			try {

				strFileName = dlg.getDirectory() + "\\" + dlg.getFile();
				FileOutputStream fos = new FileOutputStream(strFileName);
				byte[] b = ta.getText().getBytes();
				fos.write(b);

			}
			catch(Exception e) {
				System.out.println("Exception: " + e);
			}
		}

		if(ae.getSource() == b3) {
			System.exit(0);
		}
	}

	public static void main(String args[]) {
		new FileDialogDemo();
	}
}