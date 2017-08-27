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
		g.fillRect(10, 230, 300, 360);
		g.setColor(Color.black);
		//Row 1
		
		g.drawRect(30, 250, 70, 70);
		g.drawRect(30, 320, 70, 70);
		g.drawRect(30, 390, 70, 70);
		g.drawRect(30, 460, 70, 70);
		//Row 2
		g.drawRect(110, 250, 70, 70);
		g.drawRect(110, 320, 70, 70);
		g.drawRect(110, 390, 70, 70);
		g.drawRect(110, 460, 70, 70);
		//Row 3
		g.drawRect(190, 250, 70, 70);
		g.drawRect(190, 320, 70, 70);
		g.drawRect(190, 390, 70, 70);
		g.drawRect(190, 460, 70, 70);

		
		
		g.setColor(white);
		g.setFont(new Font("Arial",Font.PLAIN,24));
		
		g.drawString("1",55,290);
		g.drawString("4",55,360);
		g.drawString("7",55,430);
		g.drawString("+/-",50,500);
		
		g.drawString("2",135,290);
		g.drawString("5",135,360);
		g.drawString("8",135,430);
		g.drawString("0",135,500);
		
		g.drawString("3",215,290);
		g.drawString("6",215,360);
		g.drawString("9",215,430);
		g.drawString(".",215,500);
	

		
		g.setColor(Color.BLACK);
		
		
		
		//g.fillRect(0, 0, 800, 600);
		
	}	

	
	public void handleInput() 
	{
		

	}
}
