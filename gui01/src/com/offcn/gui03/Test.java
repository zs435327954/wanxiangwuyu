package com.offcn.gui03;


import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("��¼");
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		jFrame.setLayout(new GridLayout(3,1,10,10));
		
		TextField textField = new TextField(20);
		TextField textField1 = new TextField(20);
		
		JButton jButton = new JButton("��¼");
		JButton jButton1 = new JButton("ȡ��");
		
		Label label = new Label("�û���");
		Label label1 = new Label("��   ��");
		
		
		jPanel2.add(jButton);
		jPanel2.add(jButton1);
		jPanel.add(label);
		jPanel1.add(label1);
		jPanel.add(textField);
		jPanel1.add(textField1);
		
		jFrame.add(jPanel);
		jFrame.add(jPanel1);
		jFrame.add(jPanel2);
		jFrame.setVisible(true);
		jFrame.setBounds(200, 200, 300, 200);
		jFrame.setDefaultCloseOperation(3);
		

	}

}
