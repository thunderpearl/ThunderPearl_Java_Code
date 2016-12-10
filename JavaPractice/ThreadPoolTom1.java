

  // This is a Good and Perfect Example of ThreadPool and Executor Service.
  // http://www.tutorialsdesk.com/2014/10/thread-pool-executor-in-java-tutorial.html

  package JavaPractice;

  import java.util.concurrent.ExecutorService; 
  import java.util.concurrent.Executors; 
  public class ThreadPoolTom1{       
   public static void main(String[] args) {      
    ExecutorService executor = Executors.newFixedThreadPool(3);     
    for (int i = 0; i < 10; i++) {        
     Runnable myRunnable = new ThreadPoolJerry1("" + i);      
     executor.execute(myRunnable);          
     }      
    executor.shutdown();    
    while (!executor.isTerminated()) {     
     
    }        
    System.out.println("Finished all threads");  
    } 
   } 

