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
		Color darkestOrange = new Color(221, 148, 2);
		Color white = new Color(255, 229, 209);
		g.setColor(darkOrange);
		g.fillRect(0, 0, 400, 600);
		g.setColor(white);
		g.fillRect(10, 10, 380, 150);
		
		g.setColor(lightOrange);
		//Row 1
		g.fillRect(20, 250, 50, 50);
		g.fillRect(20, 330, 50, 50);
		g.fillRect(20, 440, 50, 50);
		g.fillRect(20, 550, 50, 50);
		//Row 2
		g.fillRect(140, 250, 50, 50);
		g.fillRect(140, 330, 50, 50);
		g.fillRect(140, 440, 50, 50);
		g.fillRect(140, 550, 50, 50);
		//Row 3
		g.fillRect(250, 250, 50, 50);
		g.fillRect(250, 330, 50, 50);
		g.fillRect(250, 440, 50, 50);
		g.fillRect(250, 550, 50, 50);
		//Row 4
		g.fillRect(360, 250, 50, 50);
		g.fillRect(360, 330, 50, 50);
		g.fillRect(360, 440, 50, 50);
		g.fillRect(360, 550, 50, 50);
		//Row 5
		g.fillRect(470, 250, 50, 50);
		g.fillRect(470, 330, 50, 50);
		g.fillRect(470, 440, 50, 50);
		g.fillRect(470, 550, 50, 50);
		//Row 6
		
		
		
		g.setColor(white);
		g.setFont(new Font("Arial",Font.PLAIN,24));
		
		g.drawString("1",47,285);
		g.drawString("4",47,395);
		g.drawString("7",47,505);
		g.drawString("+/-",30,620);
		
		g.drawString("2",157,285);
		g.drawString("5",157,395);
		g.drawString("8",157,505);
		g.drawString("0",157,620);
		
		g.drawString("3",267,285);
		g.drawString("6",267,395);
		g.drawString("9",267,505);
		g.drawString(".",275,610);
		
	
		
		
		
		
		g.setColor(Color.BLACK);
		
		
		
		//g.fillRect(0, 0, 800, 600);
		
	}	

	
	public void handleInput() 
	{
		

	}
}
