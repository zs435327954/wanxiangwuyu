package com.offcn.gui02;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListenerTest {

	public static void main(String[] args) {
Frame frame = new Frame();
		
		frame.addMouseListener((MouseListener) new MyMouseListener());
		
		frame.setSize(200, 200);

		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		frame.setVisible(true);
	}

}

class MyMouseListener implements MouseListener {

	public void mouseClicked1(MouseEvent e) {
		
		System.out.println("当前鼠标的位置X:"+e.getX()+",Y:"+e.getY());
		
	}

	public void mousePressed1(MouseEvent e) {
		
		
	}

	public void mouseReleased1(MouseEvent e) {
		
		
	}

	public void mouseEntered1(MouseEvent e) {
		
	}

	public void mouseExited1(MouseEvent e) {
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	
	public void mousePressed(MouseEvent e) {
		
		
	}

	
	public void mouseReleased(MouseEvent e) {
		
		
	}

	
	public void mouseEntered(MouseEvent e) {
		
		
	}

	
	public void mouseExited(MouseEvent e) {
		
		
	}
	
	
	
}


