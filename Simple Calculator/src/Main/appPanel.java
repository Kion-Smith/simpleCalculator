package Main;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class appPanel extends JPanel implements Runnable,KeyListener,MouseListener
{
	private final int WIDTH = 600;
	private final int HEIGHT = 800;
	
	private Thread thread;
	
	
	
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

	public void run() 
	{
		
		
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
