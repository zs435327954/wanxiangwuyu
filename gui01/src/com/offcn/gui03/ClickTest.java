package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickTest {
	static int click;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new BorderLayout(0,0));
		
		JButton jButton = new JButton("���һ��");
		JLabel jLabel = new JLabel();
		jLabel.setText("");
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			jLabel.setText("�����"+(++click)+"��");
			
				
			}
		});
		
		jFrame.add(jButton,BorderLayout.NORTH);
		jFrame.add(jLabel,BorderLayout.SOUTH);
		
		jFrame.setSize(300, 100);
		
		jFrame.setVisible(true);
		

	}

}
