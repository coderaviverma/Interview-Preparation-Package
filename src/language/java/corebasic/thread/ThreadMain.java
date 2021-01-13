package language.java.corebasic.thread;

public class ThreadMain {


    public static void main(String[] args) {


        ObjA objA = new ObjA();
        ObjA objB=new ObjA();

        //Object level lock on m1 & m2. can run two diff method from two different threads.
        Thread t1 = new Thread(new Thread1(objA));
        t1.start();
        Thread t2 = new Thread(new Thread2(objB));
        t2.start();


        //Class Level Lock on Method m3 & m4. Will run one by one
//        Thread t3 = new Thread(new Thread3(objA));
//        t3.start();
//        Thread t4 = new Thread(new Thread4(objB));
//        t4.start();


    }
}
