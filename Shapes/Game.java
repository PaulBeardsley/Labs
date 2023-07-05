package lab09;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
// create an array of 3 balls
	
	public ArrayList<Shape> balls = new ArrayList<Shape>();
	
//			balls.add(new Shape(20, 20, 30, 30,SHAPE_TYPE.RECTANGLE));
			 
//			new Shape(30, 30, 40, 40,SHAPE_TYPE.THREEDRECTANGLE), 
//			new Shape(35, 25, 50, 50,SHAPE_TYPE.ARC)
//	};

	Game() {
				JFrame frame = new JFrame();
				this.setSize(400, 400);
				frame.add(this);
				frame.pack();
				frame.setVisible(true);
		
				Shape.setWorld(400, 300);
				
				Timer t = new Timer();
				
				
				
				TimerTask tt = new TimerTask() {
					@Override
					public void run() {
						draw();
					}
				};

				t.schedule(tt, 0, 50);

		
				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						t.cancel();
						tt.cancel();
					}
				});
		}

	public void draw() {
		// call the move() method of all balls
		for(Shape b : balls) {
			b.Move();
		}
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);
		// draw each ball in balls
		for(Shape b : balls) {
//			g.drawOval( b.x, b.y, b.w, b.h );   
			
			switch(b.getShape_Type()){
				case RECTANGLE:
					g.drawRect(b.x, b.y, b.w, b.h);
					break;
				case THREEDRECTANGLE:
					g.draw3DRect(b.x, b.y, b.w, b.h, true);
					break;
				case ROUNDRECTANGLE:
					g.drawRoundRect(b.x, b.y, b.w, b.h, 5, 5);
					break;
				case ARC:
					g.drawArc(b.x, b.y, b.w, b.h, 100, 100);
					break;
				default:
					g.drawOval( b.x, b.y, b.w, b.h );
					
			}
			
		}
		

		
		
		
		
}
}

