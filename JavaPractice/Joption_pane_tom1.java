package JavaPractice;

// This program is for little GUI

import javax.swing.JOptionPane; // This class is important for using method of input.
// and other UI Methods
public class Joption_pane_tom1 {
	public static void main(String[] args)
	{
		// For inputting the value in the input box.
		String fn = JOptionPane.showInputDialog("Enter the first number");
		String sn = JOptionPane.showInputDialog("Enter the second number");
		
		int num1 = Integer.parseInt(fn); // Converting String to Integers. 
		int num2 = Integer.parseInt(sn);
			
		int sum = num1 + num2;
		
		// Showing the Final result and message.
		JOptionPane.showMessageDialog(null, "The sum is "+sum, "The Title", JOptionPane.PLAIN_MESSAGE);
	}
	
}
