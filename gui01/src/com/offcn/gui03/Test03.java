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
		
		JFrame jFrame = new JFrame("�û�ע�����");
		jFrame.setLayout(new GridLayout(3,1,20,20));
		
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		
		JLabel jLabel = new JLabel("��ϲ�����˶�");
		JLabel jLabel1 = new JLabel("����Ա�");
		
		JCheckBox jCheckBox = new JCheckBox("����");
		JCheckBox jCheckBox1 = new JCheckBox("����");
		JCheckBox jCheckBox2 = new JCheckBox("����");
		
		JRadioButton jRadioButton = new JRadioButton("��");
		JRadioButton jRadioButton1 = new JRadioButton("Ů");
		
		JButton jButton = new JButton("ע���û�");
		JButton jButton1 = new JButton("ȡ���û�");
		
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
