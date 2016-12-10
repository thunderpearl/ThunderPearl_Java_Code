

package JavaPractice;

// Here in this class we are just providing the window size, visibility and 
// closing option.
import javax.swing.JFrame; // for basic window features.


public class Eventhandlingtom1 {
	public static void main(String[] args)
	{
		Eventhandlingjerry1 obj1 = new Eventhandlingjerry1();
		obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj1.setSize(750, 570);
		obj1.setVisible(true);
	}
}
