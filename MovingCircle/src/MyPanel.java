import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements KeyListener, ActionListener{
	Timer t = new Timer(5,this);
	double x = 0, y = 0, chX = 0, chY = 0;
	public static Wall wall = new Wall();
	public static Levels data = new Levels();
	double[] playerPos = {0,0};
	double[] levelData;
	double[] collision;
	double isCollided = 0;
	public MyPanel() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		levelData = Levels.Level1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		x += chX;
		y += chY;
		if(y >= MoveCircle.frame.getContentPane().getSize().height - 40) {
			y = MoveCircle.frame.getContentPane().getSize().height - 40;
		}
		if (x >= MoveCircle.frame.getContentPane().getSize().width - 40) {
			x = MoveCircle.frame.getContentPane().getSize().width - 40;
			}
		if (y <= 0) {
			y = 0;
		}
		if (x <= 0) {
			x = 0;
		}
		playerPos[0] = x;
		playerPos[1] = y;
		collision = wall.WallCollision(playerPos,levelData);
		if(collision[2] == 1) {
			y = collision[1];
			x = collision[0];
		}
	}
	public void up() {
		chY = -3;
	}
	public void down() {
		chY = 3;
	}
	public void left() {
		chX = -3;
	}
	public void right() {
		chX = 3;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP) {
			up();
		}
		if(code == KeyEvent.VK_DOWN) {
			down();
		}
		if(code == KeyEvent.VK_LEFT) {
			left();
		}
		if(code == KeyEvent.VK_RIGHT) {
			right();
		}
		if(code == KeyEvent.VK_2) {
			levelData = Levels.Level2();
		}
		if(code == KeyEvent.VK_1) {
			levelData = Levels.Level1();
		}
		}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			chY = 0;
		}
		if (code == KeyEvent.VK_DOWN) {
			chY = 0;
		}
		if (code == KeyEvent.VK_LEFT) {
			chX = 0;
		}
		if (code == KeyEvent.VK_RIGHT) {
			chX = 0;
		}
	}
	public void paintComponent(Graphics g) {
		int scan0 = 0, scan1 = 1, scan2 = 2, scan3 = 3;
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(new Ellipse2D.Double(x,y,40,40));
			
		for (int i = 0; i < data.GetNumOfWalls(); i++){
			g2.fill(new Rectangle2D.Double(levelData[scan0],levelData[scan1],levelData[scan2],levelData[scan3]));
			scan0 += 4;
			scan1 += 4;
			scan2 += 4;
			scan3 += 4;
		}
	}
}
