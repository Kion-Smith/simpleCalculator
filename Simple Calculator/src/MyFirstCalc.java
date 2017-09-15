import javax.swing.JFrame;
/*
 * 
 * Project for CS 2336
 * Create a calculator similar to the default windows in programmer mode
 * 
 */
public class MyFirstCalc 
{
	public static void main(String[] args)
	{
		Calculator myCalc = new Calculator();// create calculator object
		myCalc.setTitle("Calculator");//set the name
		myCalc.setVisible(true);//set visible
		myCalc.setSize(400,200);//set the size
		myCalc.setLocationRelativeTo(null);//place in the middle of the screen
		myCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit program when exited
	}
}
