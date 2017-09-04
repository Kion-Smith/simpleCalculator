package Controller;

public class mouseHandler 
{
	
	public static boolean UP =false;
	public static boolean DOWN= false;
	public static boolean HOVER= false;
	public static boolean OFF=false;
	
	public static boolean mouseDown()
	{
		DOWN = true;
		UP = false;
		HOVER = false;
		OFF = false;
		
		return DOWN;
	}
	public static boolean mouseUp()
	{	
		UP = true;
		DOWN = false;
		HOVER = false;
		OFF = false;
		return UP;
	}
	public static boolean mouseHover()
	{
		HOVER = true;
		DOWN = false;
		UP = false;
		OFF = false;
		return HOVER;
	}
	public static boolean mouseOff()
	{
		OFF = true;
		DOWN = false;
		UP = false;
		HOVER = false;
		
		return OFF;
	}
	public static void update()
	{
		
	}
}
