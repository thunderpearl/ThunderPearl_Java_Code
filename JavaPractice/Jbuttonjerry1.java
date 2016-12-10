

// WE ARE NOT ABLE TO INCLUDE IMAGES HERE IN ECLIPSE SO IT'S NOT WORKING HERE. 
// THOUGH THIS IS WORKING IN NORMAL TEXT EDITOR AND WORKPLACE.
package JavaPractice;

import java.awt.FlowLayout; // setting default layout
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame; // basic windows features
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jbuttonjerry1 extends JFrame {

	private JButton reg;
	private JButton custom;
	
	public Jbuttonjerry1()
	{
		super("The Title");
		setLayout(new FlowLayout());
		
		reg = new JButton("reg button"); // adding a button
		add(reg);
		
		// Take that image and save it into b.
		Icon b = new ImageIcon(getClass().getResource("button1.png"));
		
		Icon c = new ImageIcon(getClass().getResource("button2.png"));
		
		custom = new JButton("Custom",b);
		custom.setRolloverIcon(c);
		add(custom);
		
		
		Handlerclass handler = new Handlerclass();
		
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	private class Handlerclass implements ActionListener
	{
		// This is the only method inside the ActionListerner interface
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
		
		
	}
}
