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

public class appPanel extends JPanel implements Runnable,KeyListener,MouseListener
{
	private final int WIDTH = 600;
	private final int HEIGHT = 800;
	
	private final int FPS = 30;
	private final int targetTime = 1000/30;
	
	private Thread thread;
	
	private boolean isRunning = false;
	private BufferedImage image;
	private Graphics2D g;
	
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
			
		}
	}
	
	public void init()
	{
		isRunning = true;
		image = new BufferedImage(WIDTH,HEIGHT,1);
		g = (Graphics2D) image.getGraphics();
	}
	public void update()
	{
		
	}
	public void draw()
	{
		
	}
	public void render()
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
		
		if(isRunning)
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
