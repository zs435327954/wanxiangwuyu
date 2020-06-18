package com.offcn.gui03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JTextArea jTextArea = new JTextArea("«Î ‰»Îƒ⁄»›",7,20);
		
		jTextArea.setFont(new Font("ÀŒÃÂ",Font.BOLD,16));
		
		jTextArea.setBackground(Color.yellow);
		
		jTextArea.setLineWrap(true);
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		
		Dimension preferredSize = jTextArea.getPreferredSize();
		
		jScrollPane.setBounds(110, 90, preferredSize.width, preferredSize.height);
		
		
        jPanel.add(jScrollPane);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(200, 200, 350, 150);
		
		jFrame.setVisible(true);
		

	}

}
