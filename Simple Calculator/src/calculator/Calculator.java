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
		Color Orange = new Color(255, 153, 0);
		Color white = new Color(255, 229, 209);
		g.setColor(darkOrange);
		g.fillRect(0, 0, 400, 600);
		
		g.setColor(white);
		g.fillRect(10, 10, 380, 150);
		
		g.setColor(Color.WHITE);
		g.fillRect(20, 20, 360, 130);
		
		g.setColor(lightOrange);
		g.fillRect(10, 230, 285, 360);
		
		g.setColor(Orange);
		g.fillRect(10, 160, 310, 90);
		g.fillRect(295, 160, 95, 430);
		
		g.setColor(Color.black);
		//Row 1
		
		g.drawRect(10, 250, 95, 85);
		g.drawRect(10, 335, 95, 85);
		g.drawRect(10, 420, 95, 85);
		g.drawRect(10, 505, 95, 85);
		//Row 2
		g.drawRect(105, 250, 95, 85);
		g.drawRect(105, 335, 95, 85);
		g.drawRect(105, 420, 95, 85);
		g.drawRect(105, 505, 95, 85);
		//Row 3
		g.drawRect(200, 250, 95, 85);
		g.drawRect(200, 335, 95, 85);
		g.drawRect(200, 420, 95, 85);
		g.drawRect(200, 505, 95, 85);

		
		
		g.setColor(white);
		g.setFont(new Font("Arial",Font.PLAIN,32));
		
		g.drawString("1",50,305);
		g.drawString("4",50,390);
		g.drawString("7",50,475);
		g.drawString("+/-",40,560);
		
		g.drawString("2",145,305);
		g.drawString("5",145,390);
		g.drawString("8",145,475);
		g.drawString("0",145,565);
		
		g.drawString("3",240,305);
		g.drawString("6",240,390);
		g.drawString("9",240,475);
		g.setFont(new Font("Arial",Font.PLAIN,48));
		g.drawString(".",240,565);
	

		
		g.setColor(Color.BLACK);
		
		
		
		//g.fillRect(0, 0, 800, 600);
		
	}	

	
	public void handleInput() 
	{
		

	}
}
