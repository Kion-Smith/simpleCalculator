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
		Color hoverOrange = new Color(	255, 128, 25);
		Color clickedOrange = new Color(228, 102, 0);
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
		
	
		
		
		//Row 1
		
		//hover chnage color of main three buttons
		if(mouseHandler.mouseX > 10 && mouseHandler.mouseX<105) // first row
		{
			g.setColor(hoverOrange);
			
			if(mouseHandler.mouseY > 150 && mouseHandler.mouseY<195) // use button
			{
				g.fillRect(10, 150, 95, 45);
				
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(10, 150, 95, 45);
				}
			}
			else if(mouseHandler.mouseY > 195 && mouseHandler.mouseY<240) // sqrt button
			{
				g.fillRect(10, 195, 95, 45);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(10, 195, 95, 45);
				}
			}
			else if(mouseHandler.mouseY > 240 && mouseHandler.mouseY<330)// 1 button
			{
				g.fillRect(10, 240, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(10, 240, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 330 && mouseHandler.mouseY<420)// 4 button
			{
				g.fillRect(10, 330, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(10, 330, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 420 && mouseHandler.mouseY<510) // 7 button
			{
				g.fillRect(10, 420, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(10, 420, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 510 && mouseHandler.mouseY<585) // +/- button
			{
				g.fillRect(10, 510, 95, 80);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(10, 510, 95, 80);
				}
			}
		}
		
		else if(mouseHandler.mouseX > 105 && mouseHandler.mouseX<200)// second row
		{
			g.setColor(hoverOrange);
			
			if(mouseHandler.mouseY > 150 && mouseHandler.mouseY<195)// save button
			{
				g.fillRect(105, 150, 95, 45);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(105, 150, 95, 45);
				}
			}
			else if(mouseHandler.mouseY > 195 && mouseHandler.mouseY<240)// power button
			{
				g.fillRect(105, 195, 95, 45);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(105, 195, 95, 45);
				}
			}
			else if(mouseHandler.mouseY > 240 && mouseHandler.mouseY<330)// 2 button
			{
				g.fillRect(105, 240, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(105, 240, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 330 && mouseHandler.mouseY<420)// 5 button
			{
				g.fillRect(105, 330, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(105, 330, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 420 && mouseHandler.mouseY<510)// 8 button
			{
				g.fillRect(105, 420, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(105, 420, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 510 && mouseHandler.mouseY<585) // 0 button
			{
				g.fillRect(105, 510, 95, 80);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(105, 510, 95, 80);
				}
			}
		}
		else if(mouseHandler.mouseX > 200 && mouseHandler.mouseX<295) // third row
		{
			g.setColor(hoverOrange);
			
			if(mouseHandler.mouseY > 150 && mouseHandler.mouseY<195) // back button
			{
				g.fillRect(200, 150, 95, 45);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(200, 150, 95, 45);
				}
			}
			else if(mouseHandler.mouseY > 195 && mouseHandler.mouseY<240)// modluo button
			{
				g.fillRect(200, 195, 95, 45);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(200, 195, 95, 45);
				}
			}
			else if(mouseHandler.mouseY > 250 && mouseHandler.mouseY<335)// 3 button
			{
				g.fillRect(200, 240, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(200, 240, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 330 && mouseHandler.mouseY<420)// 6 button
			{
				g.fillRect(200, 330, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(200, 330, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 420 && mouseHandler.mouseY<510)// 9 button
			{
				g.fillRect(200, 420, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(200, 420, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 510 && mouseHandler.mouseY<580)// . button
			{
				g.fillRect(200, 510, 95, 80);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(200, 510, 95, 80);
				}
			}
		
		}
		else if(mouseHandler.mouseX > 295 && mouseHandler.mouseX<390)// 4th row
		{
				g.setColor(hoverOrange);
			if(mouseHandler.mouseY > 150 && mouseHandler.mouseY<240)// + button
			{
				g.fillRect(295, 150, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(295, 150, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 240 && mouseHandler.mouseY<330)// - button
			{
				g.fillRect(295, 240, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(295, 240, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 330 && mouseHandler.mouseY<420)// * button
			{
				g.fillRect(295, 330, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(295, 330, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 420 && mouseHandler.mouseY<510)// / button
			{
				g.fillRect(295, 420, 95, 90);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(295, 420, 95, 90);
				}
			}
			else if(mouseHandler.mouseY > 510 && mouseHandler.mouseY<595)// = button
			{
				g.fillRect(295, 510, 95, 80);
				if(mouseHandler.DOWN)
				{
					g.setColor(clickedOrange);
					g.fillRect(295, 510, 95, 80);
				}
			}
		}
		
		
		
		g.setColor(lightOrange);
		//g.setColor(white);
		g.drawRect(10, 240, 95, 90);// 1
		g.drawRect(10, 330, 95, 90);// 4
		g.drawRect(10, 420, 95, 90);// 7
		g.drawRect(10, 510, 95, 80);// +/1
		//Row 2
		g.drawRect(105, 240, 95, 90);// 2
		g.drawRect(105, 330, 95, 90);// 5
		g.drawRect(105, 420, 95, 90);// 8
		g.drawRect(105, 510, 95, 80);// 0
		//Row 3
		g.drawRect(200, 240, 95, 90);// 3
		g.drawRect(200, 330, 95, 90);// 6
		g.drawRect(200, 420, 95, 90);// 9
		g.drawRect(200, 510, 95, 80);// .
		
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
		
	}	
	public void handleInput() 
	{
		

	}
}
