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
		Color darkOrange = new Color(229, 122, 34);// Orange
		Color lightOrange = new Color(255, 156, 76);// Orange
		Color white = new Color(255, 229, 209);
		g.setColor(darkOrange);
		g.fillRect(0, 0, 600, 800);
		g.setColor(white);
		g.fillRect(10, 10, 580, 200);
		
		g.setColor(lightOrange);
		
		g.fillRect(10, 220, 100, 100);
		g.fillRect(10, 330, 100, 100);
		g.fillRect(10, 440, 100, 100);
		
		g.fillRect(120, 220, 100, 100);
		g.fillRect(120, 330, 100, 100);
		g.fillRect(120, 440, 100, 100);
		
		g.fillRect(230, 220, 100, 100);
		g.fillRect(230, 330, 100, 100);
		g.fillRect(230, 440, 100, 100);
		
		g.fillRect(120, 550, 100, 100);
		
		g.setColor(white);
		g.setFont(new Font("Arial",Font.PLAIN,48));
		
		g.drawString("1",47,285);
		g.drawString("4",47,395);
		g.drawString("7",47,505);
		
		g.drawString("2",157,285);
		g.drawString("5",157,395);
		g.drawString("8",157,505);
		
		g.drawString("3",267,285);
		g.drawString("6",267,395);
		g.drawString("9",267,505);
		
		g.drawString("0",157,620);
		
		g.setColor(Color.BLACK);
		
		
		
		//g.fillRect(0, 0, 800, 600);
		
	}	

	
	public void handleInput() 
	{
		

	}
}
