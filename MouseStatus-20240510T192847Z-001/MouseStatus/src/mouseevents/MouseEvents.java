package mouseevents;

import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends WindowAdapter implements MouseListener {
	Frame f;
	Label l;
	
	public MouseEvents() {
		f = new Frame();
		
		f.setSize(400,400);
		f.setTitle("MOUSE STATUS EVENTS");
		f.setLayout(null);
		f.setVisible(true);
		
		init();
		add_component();
	}
	
	private void init() {
		// TODO Auto-generated method stub
		l = new Label("");
	}
	
	private void add_component() {
		// TODO Auto-generated method stub
		l.setBounds(20,50,300,20);
		f.add(l);
		
		f.addWindowStateListener(this);
		l.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		f.setBackground(Color.blue);
		l.setText("Mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		f.setBackground(Color.gray);
		l.setText("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		f.setBackground(Color.CYAN);
		l.setText("Mouse Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		f.setBackground(Color.green);
		l.setText("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		f.setBackground(Color.magenta);
		l.setText("Mouse Exited");
	}
	
	public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
	
	public static void main(String[] args) {
		new MouseEvents();
	}
	
}
