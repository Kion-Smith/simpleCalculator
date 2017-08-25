package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import calculator.Calculator;

@SuppressWarnings("serial")
public class appPanel extends JPanel implements Runnable,KeyListener,MouseListener
{
	private final int WIDTH = 600;
	private final int HEIGHT = 800;
	
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
	
	public void mouseClicked(MouseEvent m) 
	{
		
	}

	public void mouseEntered(MouseEvent m)
	{
		
	}

	
	public void mouseExited(MouseEvent m)
	{
		
	}

	
	public void mousePressed(MouseEvent m)
	{

	}

	
	public void mouseReleased(MouseEvent m)
	{
		
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
