

 // This is a Good and Perfect Example of ThreadPool and Executor Service.
    // http://www.tutorialsdesk.com/2014/10/thread-pool-executor-in-java-tutorial.html

    package JavaPractice;

    public class ThreadPoolJerry1 implements Runnable {
        
        private String command;
        
        public ThreadPoolJerry1(String s){
            this.command=s;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" Start. Thread from Pool = "+command);
            processCommand();
            System.out.println(Thread.currentThread().getName()+" End.");
        }

        private void processCommand() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString(){
            return this.command;
        }
    }
