package com.offcn.gui02;


import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoderlayOutTEST {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Á·Ï°");
		
		JPanel jpanel = new JPanel();
		
		jpanel.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		
        jpanel.setBackground(Color.YELLOW);
		
		jFrame.add(jpanel);
		
		JButton jButton1 = new JButton("Java");
		JButton jButton2 = new JButton("Python");
		JButton jButton3 = new JButton("Php");
		JButton jButton4 = new JButton("C++");
		
		jpanel.add(jButton1);
		jpanel.add(jButton2);
		jpanel.add(jButton3);
		jpanel.add(jButton4);
		
		jFrame.setSize(300, 150);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		
		
		
		

	}

}
