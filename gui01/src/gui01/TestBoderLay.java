package gui01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class TestBoderLay {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new BorderLayout());
		
		Button East = new Button("East");
		Button West = new Button("West");
		Button South = new Button("South");
		Button North = new Button("North");
		Button Center = new Button("Center");
		
		frame.add(East,"East");
		frame.add(West,"West");
		frame.add(South,"South");
		frame.add(North,"North");
		frame.add(Center,"Center");
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
