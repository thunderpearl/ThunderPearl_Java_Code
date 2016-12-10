

/*
        Create New Thread Using Runnable Example
        This Java example shows how to create a new thread by implementing
        Java Runnable interface.
*/
 
/*
 * To create a thread using Runnable, a class must implement
 * Java Runnable interface.
 */

// Thread is an independent path of execution within a program.
// Many threads can run concurrently and this is cost effective also as compare
// to multitasking

package JavaPractice;
public class threadtom2 implements Runnable{
 
        /*
         * A class must implement run method to implement Runnable
         * interface. Signature of the run method is,
         *
         * public void run()
         *
         * Code written inside run method will constite a new thread.
         * New thread will end when run method returns.
         */
        public void run(){
            // This is the method which will be executed when a thread is started. 
        	
        	// we need to override the run method with our concept like below
        	// which is the only method that needs to be implemented
                for(int i=0; i < 5; i++){
                        System.out.println("Child Thread : " + i);
                       
                        try{
                                Thread.sleep(50);
                        }
                        catch(InterruptedException ie){
                                System.out.println("Child thread interrupted! " + ie);
                        }
                }
               
                System.out.println("Child thread finished!");
        }
       
        public static void main(String[] args) {
               
                /*
                 * To create new thread, use
                 * Thread(Runnable thread, String threadName)
                 * constructor.
                 *
                 */
               
                Thread t = new Thread(new threadtom2(), "My Thread");
               
                /*
                 * To start a particular thread, use
                 * void start() method of Thread class.
                 *
                 * Please note that, after creation of a thread it will not start
                 * running until we call start method.
                 */
               
                t.start();
               
                for(int i=0; i < 5; i++){
                       
                        System.out.println("Main thread : " + i);
                       
                        try{
                                Thread.sleep(100);
                        }
                        catch(InterruptedException ie){
                                System.out.println("Child thread interrupted! " + ie);
                        }
                }
                System.out.println("Main thread finished!");
        }
}
