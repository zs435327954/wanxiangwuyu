package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class PaintTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.setSize(300, 300);
		
		

	}

}
class DrawPanel extends Panel {
	
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.BLUE);
		
		g.fillRect(100, 150, 100, 100);
		
	}
	
}