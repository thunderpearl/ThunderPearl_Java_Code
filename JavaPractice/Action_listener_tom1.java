package JavaPractice;

// This is for using windows in out main method right here
import javax.swing.JFrame;

class Action_listener_tom1
{
	 public static void main(String[] args){
		 
		 Action_listener_jerry1 obj = new Action_listener_jerry1();
		 
		 // This is to use the cross sign on the window.
		 obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 obj.setSize(400,300);
		 obj.setVisible(true);
		
	}
}
