import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveCircle {
	static JFrame frame = new JFrame();
	MyPanel panel = new MyPanel();
	public MoveCircle() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setTitle("Moving Circle");
	}
	
	public static void main(String[] args) {
		new MoveCircle();
	}
}
