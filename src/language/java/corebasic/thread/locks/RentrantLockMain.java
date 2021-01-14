package language.java.corebasic.thread.locks;

import java.util.concurrent.locks.ReentrantLock;

public class RentrantLockMain {

    public static void main(String[] args) {

        //Create thread Queue so the first come will be first served in Sequence

        //-> T1 (Aquired and Working), T2-> Waiting T3 - Waiting T4 - Waiting


        ReentrantLock lock=new ReentrantLock();

//        ReentrantLock lock=new ReentrantLock(false); //disable sequence

        lock.lock();

        try{
            //access resources
        }finally {
            lock.unlock();
        }

    }
}
