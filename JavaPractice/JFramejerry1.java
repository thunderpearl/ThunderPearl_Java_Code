

package JavaPractice;

import java.awt.FlowLayout; // import how things will be placed, gives default layout.
import javax.swing.JFrame; // gives us the basic window features
import javax.swing.JLabel; // output texts and images.

// This class will inherit all from JFrame.
public class JFramejerry1 extends JFrame{
	
	private JLabel item1;
	
	public JFramejerry1() // we created a constructor here.
	{
		super("The Title Bar"); // This is for title.
		setLayout(new FlowLayout()); // This gives us default layout;
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is gonna show up on hover");
		
		// We have created item1, gives is default layout, added text to it.
		// provided tool tip to it
		// now, we will add this item.
		
		add(item1);
	}
}
