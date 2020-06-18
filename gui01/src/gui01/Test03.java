package gui01;



import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
;

public class Test03 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new GridLayout(2,1));
		Panel panel1 = new Panel(new BorderLayout());
		Panel panel2 = new Panel(new BorderLayout());
		Button button1 = new Button("East");
		frame.add(panel1);
		frame.add(panel2);
		
		
		
		
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}

}
