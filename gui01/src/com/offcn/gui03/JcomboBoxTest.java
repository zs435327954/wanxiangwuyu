package com.offcn.gui03;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JcomboBoxTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
		JComboBox jComboBox = new JComboBox();
		
		jComboBox.addItem("--��ѡ��--");
        jComboBox.addItem("���֤");
        jComboBox.addItem("���֤");
        jComboBox.addItem("���֤");
        
        jPanel.add(jComboBox);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
		
		


	}

}
