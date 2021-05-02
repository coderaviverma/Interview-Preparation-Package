package testclass.done;

public class ThreadDemoMain {
    volatile static int count=0;

    public static void main(String[] args) {

        Object lock=new Object();
        int n=15;

        EvenThread evenThread=new EvenThread(n,count,lock);
        OddThread oddThread=new OddThread(n,count,lock);
        Thread t1=new Thread(evenThread,"Even Thread");
        t1.start();
        Thread t2=new Thread(oddThread,"Odd Thread");
        t2.start();


        //4- C1- T1 - L1  C2 - T2 - L1
        //l3
    }
}
