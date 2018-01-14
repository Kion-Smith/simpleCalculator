package Main;

import javax.swing.JFrame;

public class Launcher 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Calculator");
		frame.add(new appPanel() );
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
