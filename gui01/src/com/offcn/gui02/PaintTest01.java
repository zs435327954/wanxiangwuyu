package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class PaintTest01 {

	public static void main(String[] args) {
		Frame frame = new Frame("°ÂÔËÎå»·");
		
		frame.setSize(300, 200);
		
		frame.add(new DrawPanel01());
		
		frame.setVisible(true);

	}

}
class DrawPanel01 extends Panel {
	
	int w = 80;
	int h = 80;
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		
		g.drawOval(10, 10, w, h);
		g.setColor(Color.BLUE);
		
		g.drawOval(80, 10, w, h);
		g.setColor(Color.ORANGE);
		
		g.drawOval(150, 10, w, h);
		g.setColor(Color.yellow);
		
		g.drawOval(50, 70, w, h);
		g.setColor(Color.green);
		
		g.drawOval(120, 70, w, h);
	}
}