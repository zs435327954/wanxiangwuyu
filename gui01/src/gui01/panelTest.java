package gui01;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class panelTest {

	public static void main(String[] args) {
	
		Frame frame = new Frame("Test Panel");
		
		frame.setLayout(null);
		
		Panel panel = new Panel();
		
		frame.setBounds(100, 100, 300, 300);
		
		frame.setVisible(true);
		
		panel.setBounds(50, 50, 100, 100);
		
		frame.setBackground(Color.red);
		
		panel.setBackground(Color.blue);
		
		frame.add(panel);
		
		
	}
}
