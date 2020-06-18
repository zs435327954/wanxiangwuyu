package com.offcn.gui03;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutText {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("test cardlayout");
		
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		JPanel cards = new JPanel();
		
		cards.setLayout(new CardLayout());
		
		JButton jButton = new JButton("��¼��ť");
		JButton jButton1 = new JButton("ע�ᰴť");
		JButton jButton2 = new JButton("�һ����밴ť");
		
		jPanel.add(jButton);
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		
		JTextField jTextField = new JTextField("�û����ı���",20);
		JTextField jTextField1 = new JTextField("�����ı���",20);
		JTextField jTextField2 = new JTextField("��֤���ı���",20);
		
		jPanel1.add(jTextField);
		jPanel1.add(jTextField1);
		jPanel1.add(jTextField2);
		
		cards.add(jPanel,"card1");
		cards.add(jPanel,"card2");
		
		CardLayout layout = (CardLayout) cards.getLayout();
		layout.show(cards, "card2");
		
		jFrame.add(cards);
		jFrame.setBounds(100, 100, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		
		
		

	}

}
