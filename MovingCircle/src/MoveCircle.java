import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MoveCircle {
	static JFrame frame = new JFrame();
	MyPanel panel = new MyPanel();
	static JButton button = new JButton("Start");
	public MoveCircle() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setTitle("Moving Circle");
		panel.setBackground(Color.black);
		panel.add(button);
	}
	
	public static void main(String[] args) {
		new MoveCircle();
	}
}
