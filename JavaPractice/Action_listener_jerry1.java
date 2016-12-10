package JavaPractice;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

// This inheritence lets us ue the window.
public class Action_listener_jerry1 extends JFrame {

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	private JPasswordField passwordField;
	
	//Now we will build up the constructor.
	public Action_listener_jerry1()
	{
		super("The Title");  // It is for the title.
		
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text Here");
		add(item2);
		
		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		// Now we are building a object of the class which we have not even made
		thehandler handler = new thehandler();
		
		item1.addActionListener(handler); //handler is the object of the "thehandler" class
		item2.addActionListener(handler); 
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
		
	}
	
	
	// This is the thehandler class
	// This class will inherit all the things of the jerryactionlistener class 
	private class thehandler implements ActionListener
	{
		
		// This method will be called automatically whenever an event occur
		// actionPerformed is a built in method
		public void actionPerformed(ActionEvent event) // event is the variable 
		{
			String string = "";   // Final string to be output
			
			
			// this "event" is like a enter or click.
			// getsource() means where it happens?
			if(event.getSource()==item1) // If they clicked on item1
			{
				
				// getActionComand will get the entered string in the text box.
				string = String.format("field1: %s", event.getActionCommand());	
			}
			
			else if(event.getSource()==item2) // If they clicked on item1
			{
				string = String.format("field2: %s", event.getActionCommand());	
			}
			
			else if(event.getSource()==item3) // If they clicked on item1
			{
				string = String.format("field3: %s", event.getActionCommand());	
			}
			
			else if(event.getSource()==passwordField) // If they clicked on item1
			{
				string = String.format("pasword field is : %s", event.getActionCommand());	
			}
			
			JOptionPane.showMessageDialog(null, string); 
		}
	}
}

