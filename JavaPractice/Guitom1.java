

package JavaPractice;

// JOptionPane is a class which gives all the buttons and stuff
import javax.swing.JOptionPane; 

class Guitom1 {
	public static void main(String[] args)
	{
		// These are for getting the input from the user and also showing the 
		// input box.
		String fn = JOptionPane.showInputDialog("Enter the First Number");
		String sn = JOptionPane.showInputDialog("Enter the Second Number");
		
		// Right now these above variables are in String form only.
		// We need to convert those into the integers
		
		int num1 =  Integer.parseInt(fn); // Just converting String into Integer.
		int num2 =  Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		// This take 4 parameters
		// null will put it in center. 2nd parameter will show message
		// 3rd parameter is for title.
		// 4th parameter is for telling that it is plain message.
		JOptionPane.showMessageDialog(null, "The sum is "+ sum, "Sum", JOptionPane.PLAIN_MESSAGE);
		
	}
}
