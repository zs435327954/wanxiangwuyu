package com.offcn.gui03;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class JlistTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
		String[] strs = new String[] {"���֤","���֤","���֤"};
				
		
		JList jList = new JList(strs);
		
        jPanel.add(jList);
		
		jFrame.add(jPanel);
		
		jFrame.setSize(300, 300);
		
		jFrame.setVisible(true);
		

	}

}
