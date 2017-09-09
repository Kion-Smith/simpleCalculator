package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Controller.mouseHandler;

public class Calculator 
{
	private int tick=0;
	public boolean isOff;
	public boolean isON;
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
		
		tick++;
		Color darkOrange = new Color(229, 122, 34);// Orange
		Color lightOrange = new Color(255, 156, 76);// Orange
		Color darkestOrange = new Color(221, 148, 2);
		Color Orange = new Color(255, 153, 0);
		Color white = new Color(255, 229, 209);
		g.setColor(darkOrange);
		g.fillRect(0, 0, 400, 600);
		
		g.setColor(white);
		g.fillRect(10, 5, 380, 140);//border
		
		g.setColor(Color.WHITE);
		g.fillRect(20, 10, 360, 130);
		
		g.setColor(lightOrange);
		g.fillRect(10, 230, 285, 360);
		
		g.setColor(Orange);
		g.fillRect(10, 150, 380, 90);//Top bar
		g.fillRect(295, 160, 95, 430);//side ways bar
		
	
		
		g.setColor(lightOrange);
		//Row 1
		
		//hover chnage color of main three buttons
		if(mouseHandler.mouseX > 10 && mouseHandler.mouseX<105)
		{
			if(mouseHandler.mouseY > 250 && mouseHandler.mouseY<335)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(10, 250, 95, 85);
			}
			if(mouseHandler.mouseY > 335 && mouseHandler.mouseY<420)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(10, 335, 95, 85);
			}
			if(mouseHandler.mouseY > 420 && mouseHandler.mouseY<505)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(10, 420, 95, 85);
			}
		}
		
		if(mouseHandler.mouseX > 105 && mouseHandler.mouseX<200)
		{
			if(mouseHandler.mouseY > 250 && mouseHandler.mouseY<335)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(105, 250, 95, 85);
			}
			if(mouseHandler.mouseY > 335 && mouseHandler.mouseY<420)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(105, 335, 95, 85);
			}
			if(mouseHandler.mouseY > 420 && mouseHandler.mouseY<505)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(105, 420, 95, 85);
			}
		}
		if(mouseHandler.mouseX > 200 && mouseHandler.mouseX<295)
		{
			if(mouseHandler.mouseY > 250 && mouseHandler.mouseY<335)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(200, 250, 95, 85);
			}
			if(mouseHandler.mouseY > 335 && mouseHandler.mouseY<420)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(200, 335, 95, 85);
			}
			if(mouseHandler.mouseY > 420 && mouseHandler.mouseY<505)
			{
				g.setColor(Color.DARK_GRAY);
				g.fillRect(200, 420, 95, 85);
			}
		}
		
		
		
		g.setColor(lightOrange);
		
		
		g.drawRect(10, 250, 95, 85);// 1
		g.drawRect(10, 335, 95, 85);// 4
		g.drawRect(10, 420, 95, 85);// 7
		g.drawRect(10, 505, 95, 85);// +/1
		//Row 2
		g.drawRect(105, 250, 95, 85);// 2
		g.drawRect(105, 335, 95, 85);// 5
		g.drawRect(105, 420, 95, 85);// 8
		g.drawRect(105, 505, 95, 85);// 0
		//Row 3
		g.drawRect(200, 250, 95, 85);// 3
		g.drawRect(200, 335, 95, 85);// 6
		g.drawRect(200, 420, 95, 85);// 9
		g.drawRect(200, 505, 95, 85);// .
		
		g.setColor(white);
		//First col for special buttons
		g.drawRect(10, 150, 95, 45);// use button
		g.drawRect(10, 195, 95, 45);// sqrt
		//Second col
		g.drawRect(105, 150, 95, 45);// save
		g.drawRect(105, 195, 95, 45);// power
		//Third col
		g.drawRect(200, 150, 95, 45);// delete
		g.drawRect(200, 195, 95, 45);// %
		
		
		
		
		
		
		//rectangle around butons
		g.drawRect(295, 150, 95, 90);
		g.drawRect(295, 240, 95, 90);
		g.drawRect(295, 330, 95, 90);
		g.drawRect(295, 420, 95, 90);
		g.drawRect(295, 510, 95, 80);
		

		
		
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
		g.drawString("=",330,565);
		g.drawString(".",240,565);
		g.drawString("/",335,485);
		g.drawString("x",330,390);
		g.drawString("_",330,280);
		g.drawString("+",332,210);
		
		
		g.setFont(new Font("Arial",Font.PLAIN,62));
		g.drawString("\u2190",220,190);//arrow
		g.setFont(new Font("Arial",Font.PLAIN,32));
		g.drawString("save",120,185);
		g.drawString("use",35,185);
		g.drawString("\u221A",35,230);//sqrt
		g.drawString("   ^",115,235);
		g.drawString("%",235,230);//modulo
		
		
		g.setColor(Color.BLACK);
		//Animations/changes over time
		if(tick <= 40)
		{
			g.fillRect(375, 10, 1, 130);// gonna need to chnage this to depend on location
		}
		else if(tick>40)
		{
			
			if(tick == 50)
			{
				tick =0;
			}
		}
		if(mouseHandler.HOVER == false && mouseHandler.OFF == false)
		{
			isON = true;
		}
		if(mouseHandler.HOVER && !mouseHandler.OFF )
		{
			g.setColor(Color.MAGENTA);
			g.drawString("The mouse is on screen", 40, 70);
		}
		if(mouseHandler.DOWN )
		{
			g.setColor(Color.GREEN);
			g.drawString("& The mouse is pressed", 0,90);
		}
		g.setColor(Color.CYAN);
		g.drawString(mouseHandler.mouseX+","+mouseHandler.mouseY, 20,110);
	
		
		
	}	
	public void handleInput() 
	{
		

	}
}
