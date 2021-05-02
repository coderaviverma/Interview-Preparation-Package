package language.java.corebasic.thread.program.printabc;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintABCMain {


    public static void main(String[] args) {

        int n=10;
        AtomicInteger i=new AtomicInteger();
        Object lock=new Object();

//        Thread1 t1=new Thread1(lock,i,n);
//        Thread2 t2=new Thread2(lock,i,n);
//        Thread3 t3=new Thread3(lock,i,n);

        Thread t1=new Thread(new Thread1(lock,i,n));
        Thread t2=new Thread(new Thread2(lock,i,n));
        Thread t3=new Thread(new Thread3(lock,i,n));

        t1.start();
        t2.start();
        t3.start();
    }
}
