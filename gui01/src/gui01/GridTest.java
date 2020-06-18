package gui01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;


public class GridTest {

	public static void main(String[] args) {
		Frame frame = new Frame();
		
		frame.setLayout(new GridLayout(5,4,3,3));
		
		
		TextArea textArea = new TextArea();
		
		Panel panel1 = new Panel(new GridLayout(1,4,3,3));
		Panel panel2 = new Panel(new GridLayout(1,4,3,3));
		Panel panel3 = new Panel(new GridLayout(1,4,3,3));
		Panel panel4 = new Panel(new GridLayout(1,4,3,3));
		
		String[] str1 = {"7","8","9","/"};
		for (int i = 0; i < str1.length; i++) {
			
			Button button = new Button(""+str1[i]);
			panel1.add(button);
		}
		
		String[] str2  = {"4","5","6","*"};
		for (int i = 0; i < str2.length; i++) {
			
			Button button = new Button(""+str2[i]);
			panel2.add(button);
			
		}
		String[] str3 = {"1","2","3","-"};
		for (int i = 0; i < str3.length; i++) {
			
			Button button = new Button(""+str3[i]);
			panel3.add(button);
			
		}
		String[] str4 = {"0",".","=","+"};
		for (int i = 0; i < str4.length; i++) {
			
			Button button = new Button(""+str4[i]);
			panel4.add(button);
			
		}
		frame.add(textArea);
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.setSize(200, 220);
		
		frame.setVisible(true);
	}

}