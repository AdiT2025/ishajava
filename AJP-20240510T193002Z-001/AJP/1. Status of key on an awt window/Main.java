import java.awt.*;
import java.awt.event.*;

public class Main extends WindowAdapter implements KeyListener {

	Label l;
	TextArea a;
	Frame f;
	
	Main(){
		f = new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("KEY LISTENER EXAMPLE");
		init();
		add_components();
	}
	
	public void init() {
		l = new Label();
		a = new TextArea();
	}
	
	public void add_components() {
		l.setBounds(20,50,100,20);
		f.add(l);
		a.setBounds(20,80,300,300);
		f.add(a);
		f.addWindowListener(this);
		a.addKeyListener(this);
	}
	
	public void windowClosing (WindowEvent e) {
		f.dispose();
	}
	
	public void keyPressed(KeyEvent e) {
		l.setText("Key Pressed " + e.getKeyChar());
	}
	
	public void keyTyped(KeyEvent e) {
		l.setText("Key Typed " + e.getKeyChar());
	}
	
	public void keyReleased(KeyEvent e) {
		l.setText("Key Released " + e.getKeyChar());
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
