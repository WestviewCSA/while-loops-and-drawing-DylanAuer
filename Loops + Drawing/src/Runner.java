import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	Random rnd = new Random(1234);	
	
	public void paint(Graphics g) {
		// Draw Grid
		for(int i=0; i<=1000; i+=10) {
			g.drawLine(0+i, 0, 0, 700-i);
		}
			for(int i=0; i<=1000; i+=10) {
				g.drawLine(0, 0+i, 0+i, 663);
			}
			int o = 0;
			int u = 0;
			while(o<=1000) {
				g.drawLine(1000-o, 0, 990, 700-o);
				o+=10;
			}
			while(u<=1000) {
				g.drawLine(1000-u, 663, 990, 0+u);
				u+=10;
			}
	}
		
	public static void main(String[] arg) {
		
		Runner m = new Runner();

	}
	
	
	public Runner() {
		JFrame f = new JFrame("Loops and Random Numbers");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,700);
		f.add(this);
		f.setVisible(true);
		
	}
	

}

