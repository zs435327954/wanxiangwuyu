package com.offcn.gui02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test01 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new GridLayout(1,2));
		Button button1 = new Button("确定");
		Button button2 = new Button("取消");
		
		frame.add(button1);
		frame.add(button2);
		frame.setVisible(true);
		button2.addActionListener(new Myactionlistener());;
		button1.addActionListener(new Myactionlistener());

	}

}
class Myactionlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("确定")) {
		
			Frame frame = new Frame("新窗口");
		
		
			frame.setSize(200,200);
		
		
			frame.setVisible(true);
		
		}else {
			
			System.exit(0);
		}		
		
	}
		
}