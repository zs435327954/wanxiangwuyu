package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test02 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("��ϰ");
		jFrame.setLayout(new BorderLayout());
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2= new JPanel();
		
		JButton jbutton = new JButton("����");
		JButton jbutton1 = new JButton("ƻ��");
		JButton jbutton2 = new JButton("�㽶");
		JButton jbutton3 = new JButton("��֦");
		JButton jbutton4 = new JButton("����");
		JButton jbutton5 = new JButton("����");
		
		Dimension dimension = new Dimension(290,200);
		jbutton2.setPreferredSize(dimension);
		
		jPanel.add(jbutton);
		jPanel.add(jbutton1);
		jPanel1.add(jbutton2);
		jPanel2.add(jbutton3);
		jPanel2.add(jbutton4);
		jPanel2.add(jbutton5);
		
		jFrame.add(jPanel,BorderLayout.NORTH);
		jFrame.add(jPanel1,BorderLayout.CENTER);
		jFrame.add(jPanel2,BorderLayout.SOUTH);
		
		jFrame.setBounds(500, 200, 250, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		
		
		

	}

}
