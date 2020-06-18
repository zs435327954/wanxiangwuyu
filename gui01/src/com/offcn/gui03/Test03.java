package com.offcn.gui03;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Test03 {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("用户注册界面");
		jFrame.setLayout(new GridLayout(3,1,20,20));
		
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		
		JLabel jLabel = new JLabel("你喜欢的运动");
		JLabel jLabel1 = new JLabel("你的性别");
		
		JCheckBox jCheckBox = new JCheckBox("足球");
		JCheckBox jCheckBox1 = new JCheckBox("篮球");
		JCheckBox jCheckBox2 = new JCheckBox("网球");
		
		JRadioButton jRadioButton = new JRadioButton("男");
		JRadioButton jRadioButton1 = new JRadioButton("女");
		
		JButton jButton = new JButton("注册用户");
		JButton jButton1 = new JButton("取消用户");
		
		jPanel.add(jLabel);
		jPanel.add(jCheckBox);
		jPanel.add(jCheckBox1);
		jPanel.add(jCheckBox2);
		
		jPanel1.add(jLabel1);
		jPanel1.add(jRadioButton);
		jPanel1.add(jRadioButton1);
		
		jPanel2.add(jButton);
		jPanel2.add(jButton1);
		
		jFrame.add(jPanel);
		jFrame.add(jPanel1);
		jFrame.add(jPanel2);
		
		jFrame.setSize(400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		
		
		
		
	}

}
