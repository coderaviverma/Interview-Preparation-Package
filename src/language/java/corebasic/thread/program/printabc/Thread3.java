package language.java.corebasic.thread.program.printabc;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread3 implements Runnable{

    Object lock;
    AtomicInteger integer;
    int end;

    public Thread3(Object lock, AtomicInteger integer, int end) {
        this.lock = lock;
        this.integer = integer;
        this.end = end;
    }

    @Override
    public void run() {


        while (integer.get()<end){
            synchronized (lock){
                if (integer.get()%3==2){
                    System.out.println("C");
                    integer.incrementAndGet();

                    lock.notifyAll();

                }else {
                    System.out.println("C lock called");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("C lock called");

                }
                System.out.println("");

            }
        }

    }
}
