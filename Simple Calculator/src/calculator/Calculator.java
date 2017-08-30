package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Calculator 
{
	private int tick=0;
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
		
		g.setColor(Color.black);
		//First row for special buttons
		g.drawRect(10, 150, 95, 45);
		g.drawRect(105, 150, 95, 45);
		g.drawRect(200, 150, 95, 45);
		//Second for special 
		g.drawRect(10, 195, 95, 45);
		g.drawRect(105, 195, 95, 45);
		g.drawRect(200, 195, 95, 45);
		
		//Regular calc bbuttons
		
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

		
		g.setColor(Color.BLACK);
		if(tick <= 40)
		{
			g.fillRect(375, 10, 1, 130);// gonna need to chnage this to depend on location
			//System.out.println(tick);
		}
		else if(tick>40)
		{
			
			if(tick == 50)
			{
				tick =0;
			}
		}
		
		
		//g.fillRect(0, 0, 800, 600);
		
	}	

	
	public void handleInput() 
	{
		

	}
}
