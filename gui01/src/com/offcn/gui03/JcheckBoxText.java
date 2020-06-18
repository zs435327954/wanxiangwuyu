package com.offcn.gui03;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JcheckBoxText {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JLabel jLabel = new JLabel("常见的编程语言：");
		
		JCheckBox jCheckBox = new JCheckBox("C");
		JCheckBox jCheckBox1 = new JCheckBox("C#");
		JCheckBox jCheckBox2 = new JCheckBox("pyhton");
		JCheckBox jCheckBox3 = new JCheckBox("php");
		JCheckBox jCheckBox4 = new JCheckBox("java",true);
		
		jPanel.add(jLabel);
		jPanel.add(jCheckBox);
		jPanel.add(jCheckBox1);
		jPanel.add(jCheckBox2);
		jPanel.add(jCheckBox3);
		jPanel.add(jCheckBox4);
		
		jFrame.add(jPanel);
		
		jFrame.setSize(400, 100);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		

	}

}
