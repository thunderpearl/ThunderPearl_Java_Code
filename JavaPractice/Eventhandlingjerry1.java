// http://tutorials.jenkov.com/java/nested-classes.html

package JavaPractice;

import java.awt.FlowLayout; // Basic default layout.
import java.awt.event.ActionListener; // used for listening.
import java.awt.event.ActionEvent; // used for doing some action.

import javax.swing.JFrame; // basic windows features.
import javax.swing.JTextField; 
import javax.swing.JPasswordField;
import javax.swing.JOptionPane; // JOptionPane makes it easier to pop of dialog box that informs 
// user about something or prompt user fpr something.

// For using the basic window features
public class Eventhandlingjerry1 extends JFrame{

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	private JPasswordField passwordField;
	
	// now creating constructor like in Jframejerry1.class
	public Eventhandlingjerry1()
	{
		// basically super keyword invoke het constructor of parent class here that is 
		// JFrame.
		super("This is the Title"); // This is for giving the title.
		setLayout(new FlowLayout()); // setting default layout.
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text Here ");
		add(item2);
		
		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false); // Now this text would not be able to edit.
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		// Now Everything is set like as in Jframejerry.class
		// next step is to add event handling functionality.
		
		
		// Object of the "thehandler" class
		thehandler handler = new thehandler();
		
		
		// adding the "handler" object to ActionListner
		// this addActionListener() method takes the argument as object.
		item1.addActionListener(handler); 
		
		item2.addActionListener(handler);
		
		item3.addActionListener(handler);
		
		passwordField.addActionListener(handler);
	}
	
	// In order to handle the event we need an Event Handling class.
	// That class needs to implement ActionListener.
	// This class is inside the Eventhandlingjerry1 class
	// hence thehandler class will inherit all the things of Eventhandlingjerry1 class
	private class thehandler implements ActionListener
	{
		// we are making a method here, which will be called 
		// automatically when an event occur.
		public void actionPerformed(ActionEvent event) // event is a variable
		// which is like the pressing of enter button.
		{
			String string = "";
			
			if(event.getSource()==item1) // means if we clicked on something and  
				// it is item1 and prior to that we typed something in it also.
			{
				// getActionCommand means get the text from that place that we typed.
				string = String.format("field 1: %s", event.getActionCommand());
			}
			
			else if(event.getSource()==item2) // means if we clicked on something and  
				// it is item1
			{
				// getActionCommand means get the text from that place.
				string = String.format("field 2: %s", event.getActionCommand());
			}
			
			else if(event.getSource()==item3) // means if we clicked on something and  
				// it is item1
			{
				// getActionCommand means get the text from that place.
				string = String.format("field 3: %s", event.getActionCommand());
			}
			
			else if(event.getSource()==passwordField) // means if we clicked on something and  
				// it is item1
			{
				// getActionCommand means get the text from that place.
				string = String.format("password field is : %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
		}
	}

}
