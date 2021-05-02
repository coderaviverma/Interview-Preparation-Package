package language.java.corebasic.thread.program.printabc;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread2 implements Runnable{

    Object lock;
    AtomicInteger integer;
    int end;

    public Thread2(Object lock, AtomicInteger integer, int end) {
        this.lock = lock;
        this.integer = integer;
        this.end = end;
    }

    @Override
    public void run() {


        while (integer.get()<end){
            synchronized (lock){
                if (integer.get()%3==1){
                    System.out.println("B");
                    integer.incrementAndGet();
                    lock.notifyAll();

                }else {
                    System.out.println("B lock called");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("B lock called released");

                }
                System.out.println("");

            }
        }

    }
}
