package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import Controller.mouseHandler;
import calculator.Calculator;

@SuppressWarnings("serial")
public class appPanel extends JPanel implements Runnable,KeyListener,MouseListener,MouseMotionListener
{
	private final int WIDTH = 400;
	private final int HEIGHT = 600;
	
	private final int FPS = 30;
	private final int targetTime = 1000/FPS;
	
	private Thread thread;
	
	private boolean isRunning;
	private BufferedImage image;
	private Graphics2D g;
	
	public Calculator calc;
	
	public appPanel()
	{	
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify()
	{
		super.addNotify();
		if(thread == null)
		{
			addKeyListener(this);
			addMouseMotionListener(this);
			addMouseListener(this);
			thread = new Thread(this);
			thread.start();
			
		}
	}
	
	public void init()
	{
		isRunning = true;
		image = new BufferedImage(WIDTH,HEIGHT,1);
		g = (Graphics2D) image.getGraphics();
		calc = new Calculator();
	}
	private void update()
	{
		calc.update();
	}
	private void draw()
	{
		calc.draw(g);
	}
	private void render()
	{
		Graphics g2 = getGraphics();
		g2.drawImage(image,0,0,WIDTH,HEIGHT,null);
		g2.dispose();
		
	}

	public void run() 
	{
		init();
		
		long start;
		long wait;
		long elapsed;
		
		while(isRunning)
		{
			start = System.nanoTime();
			
			update();
			draw();
			render();
			
			elapsed = System.nanoTime() - start;
			wait = targetTime - elapsed / 10000000;
			if(wait<0)
			{
				wait = targetTime;
			}
			
			try 
			{
				Thread.sleep(wait);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
	public void mouseMoved(MouseEvent m) 
	{
		mouseHandler.setX(m.getX() );
		mouseHandler.setY(m.getY() );
	}
	public void mouseDragged(MouseEvent m) 
	{
	
	}

	public void mouseClicked(MouseEvent m) 
	{
		
	}

	public void mouseEntered(MouseEvent m)
	{
		mouseHandler.mouseHover();
	}

	
	public void mouseExited(MouseEvent m)
	{
		mouseHandler.mouseOff();
	}

	
	public void mousePressed(MouseEvent m)
	{
		mouseHandler.mouseDown();
		
	}
	public void mouseHover(MouseEvent m)
	{
		mouseHandler.setX(m.getX() );
		mouseHandler.setY(m.getY() );
	}
	
	public void mouseReleased(MouseEvent m)
	{
		mouseHandler.mouseUp();
	}

	
	public void keyPressed(KeyEvent k)
	{

	}
	
	public void keyReleased(KeyEvent k) 
	{

	}

	
	public void keyTyped(KeyEvent k) 
	{
		
	}

	
	

}
