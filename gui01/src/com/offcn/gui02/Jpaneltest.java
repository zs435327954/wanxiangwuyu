package com.offcn.gui02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpaneltest {

	public static void main(String[] args) {
        JFrame jFrame = new JFrame("test jpanel");
		
		jFrame.setSize(200, 200);
		
		JPanel jpanel = new JPanel();
		
		jpanel.setBackground(Color.gray);
		
		jFrame.add(jpanel);
		
		JLabel jLabel = new JLabel("test panel");
		
		jpanel.add(jLabel);
		
		jFrame.setVisible(true);

	}

}
