package Controller;

import java.util.Stack;

public class calculatorHandler 
{
	public static String calculation;
	 static Stack<String> postFixStack;
	
	public static void getInput(int input)
	{
		calculation += ""+input;
	}
	public static void getInput(String input)
	{
		calculation += input;
	}
	public static void postFix()
	{
		postFixStack = new Stack<String>();
		for(int i=0;i<calculation.length();i++)
		{
			postFixStack.push(calculation.charAt(i) +"");
		}
		while(!calculation.isEmpty() )
		{
			if(postFixStack.equals("+"))
			{
				// do calculations
				
				postFixStack.pop();
			}
			else if(postFixStack.equals("-"))
			{
				// do calculations
			}
			else if(postFixStack.equals("*"))
			{
				// do calculations
				postFixStack.pop();
			}
			else if( postFixStack.equals("/"))
			{
				// do calculations
			}
			else if(postFixStack.equals("^"))
			{
				// do calculations
				postFixStack.pop();
			}
		}
	}
	public static String printValue()
	{
		if(calculation == null)
		{
			return "";
		}
		return calculation;
	}
	public static boolean checkToClear()
	{
		if(calculation == null)
		{
			
		}
		else if(calculation.contains("="))
		{
			calculation ="";
			return true;
		}
		return false;
	}
}
