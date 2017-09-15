import java.awt.BorderLayout;

import javax.swing.*;


public class Calculator extends JFrame
{
	JPanel panel1;// for holding the user input
	JPanel panel2;// for holding the buttons that manipulate input
	
	JPanel panel3;// the result labels
	
	JLabel num1Label,num2Label,resLabel;// the various labels
	
	JButton addButton,subButton,multButton;//all the buttons
	
	JTextField num1Field,num2Field,resField;// all the fields to write in
	public Calculator()
	{
		//Initialize panels
		 panel1 = new JPanel();
		 panel2 = new JPanel();
		 panel3 = new JPanel();
		 
		//Initialize Label
		num1Label = new JLabel("Num 1");
		num2Label = new JLabel("Num 2");
		resLabel = new JLabel("Result");
		
		//Initialize Text fields
		num1Field = new JTextField(10);
		num2Field = new JTextField(10);
		resField = new JTextField(10);
		
		//Initialize Button
		addButton = new JButton("Add");
		subButton = new JButton("Sub");
		multButton = new JButton("Mult");
		
		
		// add the components to the 1st panel
		panel1.add(num1Label);
		panel1.add(num1Field);
		panel1.add(num2Label);
		panel1.add(num2Field);
		// add the components to the 2nd panel
		panel2.add(addButton);
		panel2.add(subButton);
		panel2.add(multButton);
		// add the components to the 3rd panel
		panel3.add(resLabel);
		panel3.add(resField);
		
		
		add(panel1,BorderLayout.NORTH);//put the contents of panel 1 at the top
		add(panel2,BorderLayout.CENTER);//put the contents of panel 2 in the middle
		add(panel3,BorderLayout.SOUTH);//put the contents of panel 3 at the bottom
		
	}
}
