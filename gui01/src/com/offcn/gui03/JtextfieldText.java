package com.offcn.gui03;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JtextfieldText {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JTextField jTextField = new JTextField(20);
		
		jTextField.setText("����һ����ͨ���ı���");
		JTextField jTextField2 = new JTextField("�������������");
jTextField2.setFont(new Font("����", Font.BOLD, 16));
		
		JTextField jTextField3 = new JTextField(30);
		
		jTextField3.setText("���Ǿ��ж�����ı�");
		
		jTextField3.setHorizontalAlignment(JTextField.CENTER);
		
		jPanel.add(jTextField);
		jPanel.add(jTextField2);
		jPanel.add(jTextField3);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(200, 200, 100, 300);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);

	}

}
