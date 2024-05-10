package keyevents;

import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends WindowAdapter implements KeyListener {
    Frame f;
    Label l;
    TextArea t;

    public KeyEvents() {
        f = new Frame("");
        
        f.setSize(400, 400);
        f.setVisible(true);
        f.setTitle("KEY ACTION EVENTS");
        f.setLayout(null);
        
        init();
        
        add_components();
        
    }
    
	public void init() {
    	l = new Label("");
        t = new TextArea();
    }
	
	public void add_components() {
    	l.setBounds(20, 50, 300, 20);
        f.add(l);
        t.setBounds(20, 80, 300, 300);
        f.add(t);

        f.addWindowListener(this);
        t.addKeyListener(this);
	}

    public void keyPressed(KeyEvent e) {
        l.setText("Status: Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Status: Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Status: Key Typed");
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new KeyEvents();
    }

}
