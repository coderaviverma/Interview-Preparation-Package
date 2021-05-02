package language.java.corebasic.thread.deadlock;

public class DeadLockDemo {


    public static void main(String[] args) {

        String res1="Avinash";
        String res2="Vishal";

        Thread t1=new Thread(){
            @Override
            public void run() {
                synchronized (res1){
                    System.out.println("Thread 1: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (res2){
                        System.out.println("Thread 1: locked resource 1");

                    }

                }

            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                synchronized (res2){
                    System.out.println("Thread 2: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (res1){
                        System.out.println("Thread 2: locked resource 2");

                    }

                }

            }
        };

        t1.start();
        t2.start();

        System.out.println("Completed");

    }




}
