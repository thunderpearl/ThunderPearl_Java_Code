package threading;

public class Thread_isalive_tom1 extends Thread{

	 public void run() {
	      for (int i = 0; i < 10; i++) {
	         printMsg(); // kinda method chaining will happen here.
	         // compiler will automatically put "this." before method.
	      }
	   }

	   public void printMsg() {
	      Thread t = Thread.currentThread();
	      String name = t.getName();
	      System.out.println("name=" + name);
	   }

	   public static void main(String[] args) {
	      Thread_isalive_tom1 tt = new Thread_isalive_tom1();
	      tt.setName("Thread");
	      System.out.println("before start(), tt.isAlive()=" + tt.isAlive());
	      tt.start();
	      System.out.println("just after start(), tt.isAlive()=" + tt.isAlive());
		
	      for (int i = 0; i < 10; i++) {
	         tt.printMsg();
	      }
		
	      System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
		
	   }
	}