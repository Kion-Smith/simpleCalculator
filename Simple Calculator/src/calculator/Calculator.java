package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Calculator 
{

	public Calculator ()
	{
		
	}

	
	public void init() 
	{
		
		
	}


	public void update() 
	{
		
		handleInput();
		
	}

	
	public void draw(Graphics2D g) 
	{
		g.setColor(Color.RED);
		g.fillRect(0, 0, 600, 800);
		System.out.println("RAN");
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial",Font.PLAIN,48));
		g.drawString("SNAKE", 320, 100);
		
		
		//g.fillRect(0, 0, 800, 600);
		
	}	

	
	public void handleInput() 
	{
		

	}
}
