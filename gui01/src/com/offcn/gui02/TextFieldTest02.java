package com.offcn.gui02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest02 {

	public static void main(String[] args) {
		
		Myframe07 myframe07 = new Myframe07();
		
		myframe07.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				
			}
			
		});

	}

}

class Myframe07 extends Frame {
	
	public Myframe07() {
		
		TextField textField = new TextField(15);
		
		Label label = new Label("+");
		
		TextField textField2 = new TextField(15);
		
		Button button = new Button("=");
		
		TextField textField3 = new TextField(10);
		
		button.addActionListener(new ActionListener07(textField,textField2,textField3));
		setLayout(new FlowLayout());
		
		
		add(textField);
		add(label);
		add(textField2);
		add(button);
		add(textField3);
		
		pack();
		
		setVisible(true);
		
		
		
	}
	
}
class ActionListener07 implements ActionListener {
	
	TextField t1,t2,t3;
	
	public ActionListener07(TextField t1, TextField t2, TextField t3) {
		
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		int i = Integer.parseInt(t1.getText());
		int j = Integer.parseInt(t2.getText());
		t1.setText("");
		t2.setText("");
		t3.setText(""+(i+j));
	}
	
	
	
}