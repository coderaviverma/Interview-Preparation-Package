package language.java.corebasic.thread.program.printabc;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 implements Runnable{

    Object lock;
    AtomicInteger integer;
    int end;

    public Thread1(Object lock, AtomicInteger integer, int end) {
        this.lock = lock;
        this.integer = integer;
        this.end = end;
    }

    @Override
    public void run() {


        while (integer.get()<end){
            synchronized (lock){
                if (integer.get()%3==0){
                    System.out.println("A");
                    integer.incrementAndGet();
                    lock.notifyAll();

                }else {
                    System.out.println("A lock called");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A lock called released");
                }
                System.out.println("");

            }
        }

    }
}
