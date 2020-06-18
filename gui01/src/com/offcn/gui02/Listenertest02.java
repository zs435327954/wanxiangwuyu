package com.offcn.gui02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Listenertest02 {

	public static void main(String[] args) {
	
		Frame frame = new Frame("listener test");
		
		frame.setSize(200, 100);
		
		Button button = new Button("start");
		Button button1 = new Button("end");
		
		button.addActionListener(new MyactionListener02());
		
		button1.addActionListener(new MyactionListener02());
		
		frame.setLayout(new BorderLayout());
		
		frame.add(button,new BorderLayout().NORTH);
		
		frame.add(button1,new BorderLayout().CENTER);

		
		
		button1.setActionCommand("Game,over");
		
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				
			}
			
		});
		
		frame.setVisible(true);
	}

}

class MyactionListener02 implements ActionListener{

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		
	}
	
	
	
}