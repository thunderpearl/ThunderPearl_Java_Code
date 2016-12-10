
package JavaPractice;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jframe_jerry1 extends JFrame{
	private JLabel item1;
	
	public Jframe_jerry1()
	{
		super("The Title Bar");
		setLayout(new FlowLayout()); // Default Layout
		
		item1 =  new JLabel("This text will come on the screen");
		item1.setToolTipText("This will pop up when we will hover");
		
		// adding item1.
		add(item1);
		
		
	}

}
