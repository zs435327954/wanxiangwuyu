package gui01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowlayOutTest {
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("TestFlowlayOut");
	    frame.setLayout(new FlowLayout(2,20,20));
		
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		Button button5 = new Button("button5");
		Button button6 = new Button("button6");
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		
		frame.pack();//设置布局的最佳大小和位置
		frame.setVisible(true);
	    }
		
}