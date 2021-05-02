package language.java.corebasic.thread.locks;

public class ThreadJoinExample {
    static Object lock=new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        
        t1.start();
        t2.start();
        t3.start();





        System.out.println("All threads are dead, exiting main thread");
    }

}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);

            synchronized (this){
                try {
                    Thread.yield();
                    System.out.println("Thread in locking state:::"+Thread.currentThread().getName());
                    wait(4000);
                    System.out.println("Thread in unlocking state:::"+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
    
}