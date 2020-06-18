package com.offcn.gui02;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Textfieldlistener {

	public static void main(String[] args) {
		
		Frame frame = new Frame("test textfieldlistener");
		
		TextField textField = new TextField();
		
		frame.add(textField);
		
		textField.addActionListener(new Myactinlistener06());
		
		textField.setEchoChar('*');
		
		
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}

class Myactinlistener06 implements  ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TextField tf = (TextField)e.getSource();
		
		System.out.println(tf.getText());
		
		tf.setText("");
	}
	
	
	
}