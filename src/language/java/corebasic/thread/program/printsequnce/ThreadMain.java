package language.java.corebasic.thread.program.printsequnce;

public class ThreadMain {

    public static void main(String[] args) {

        //Print Number Sequence using 3 Thread.

        PrintSequence printSequence1=new PrintSequence(1);
        PrintSequence printSequence2=new PrintSequence(2);
        PrintSequence printSequence3=new PrintSequence(0);

        Thread t1=new Thread(printSequence1 ,"T1");
        Thread t2=new Thread(printSequence2 ,"T2");
        Thread t3=new Thread(printSequence3 ,"T3");

        t1.start();
        t2.start();
        t3.start();

    }
}
