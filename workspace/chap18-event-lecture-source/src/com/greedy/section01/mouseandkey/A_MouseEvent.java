package com.greedy.section01.mouseandkey;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_MouseEvent extends JFrame implements MouseListener, MouseMotionListener {

	public A_MouseEvent() {
		this.setTitle("Mouse Event");
		this.setSize(300, 200);
	
		JPanel panel = new JPanel();
		
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new A_MouseEvent();

	}


	public void display(String s, MouseEvent e) {
		System.out.println(s + "X = " + e.getX() + "Y = " + e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent e) {    //Press랑 Release 합친겨
		// TODO Auto-generated method stub
		this.display("MouseClicked", e);
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("MousePressed", e);
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("MouseReleased", e);
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("MouseEntered", e);
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("MouseExited", e);
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("MouseDragged", e);
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("MouseMoved", e);
	}

}
