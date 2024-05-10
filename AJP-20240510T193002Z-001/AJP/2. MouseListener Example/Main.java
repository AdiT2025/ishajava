import java.awt.*;
import java.awt.event.*;


public class Main extends WindowAdapter implements MouseListener{

	Frame f;
	TextField tf;
	
	Main(){
		f = new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("Video2");
		init();
		add_components();
	}
	
	public void init() {
		tf = new TextField(20);
		tf.setBounds(20,50,100,20);
	}
	
	public void add_components() {
		f.add(tf);
		f.addWindowListener(this);
		f.addMouseListener(this);
	}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	
	public void mousePressed(MouseEvent e) {
		tf.setText("Mouse Pressed");
		f.setBackground(Color.red);
	}
	
	public void mouseReleased(MouseEvent e) {
		tf.setText("Mouse Released");
		f.setBackground(Color.pink);
	}
	
	public void mouseExited(MouseEvent e) {
		tf.setText("Mouse Exited");
		f.setBackground(Color.green);
	}
	
	public void mouseClicked(MouseEvent e) {
		tf.setText("Mouse Clicked");
		f.setBackground(Color.yellow);
	}
	
	public void mouseEntered(MouseEvent e) {
		tf.setText("Mouse Entered");
		f.setBackground(Color.blue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
