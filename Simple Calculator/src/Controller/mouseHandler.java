package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class mouseHandler 
{
	
	public static boolean UP =false;
	public static boolean DOWN= false;
	public static boolean HOVER= false;
	public static boolean OFF=false;// need array mouseState object to hold each state 
	
	public static int mouseX;
	public static int mouseY;
	
	public static void mouseDown()
	{
		DOWN = true;
		UP = false;
		
	}
	public static void mouseUp()
	{	
		UP = true;
		DOWN = false;
		
	}
	public static void mouseHover()
	{
		HOVER = true;
		OFF = false;
	}
	public static void mouseOff()
	{
		OFF = true;
		HOVER = false;
	}
	public static void setX(int x)
	{
		mouseX = x;
	}
	public static void setY(int y)
	{
		mouseY =y;
	}
	
	
}
