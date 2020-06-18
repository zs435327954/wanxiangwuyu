package gui01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowListener;


public class Test02 {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		Panel panel = new Panel();
		panel.setLayout(new FlowLayout(2,5,10));
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		Button button7 = new Button("7");
		Button button8 = new Button("8");
		Button button9 = new Button("9");
		panel.setSize(100, 100);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
	
		
		frame.setLayout(new BorderLayout());//设置窗口的布局模式为边框布局
		Button East = new Button("East");
		Button West = new Button("West");
		Button South = new Button("South");
		Button North = new Button("North");
		
		
		frame.add(East,"East");
		frame.add(West,"West");
		frame.add(South,"South");
		frame.add(North,"North");
		frame.add(panel,"Center");
		
		
		
		frame.pack();
		
		frame.setVisible(true);
		
		
	}

}
