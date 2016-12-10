

package JavaPractice;

import javax.swing.JFrame; // gives basic windows features.

public class JFrametom1 {
	public static void main(String[] args)
	{
		JFramejerry1 obj1 = new JFramejerry1();
		
		// here we defining how the window will close. 
		obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj1.setSize(400,400); // setting the size. 
		obj1.setVisible(true); // setting the visibility, true. 
	}

}
