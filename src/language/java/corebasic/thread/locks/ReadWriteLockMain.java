package language.java.corebasic.thread.locks;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockMain {

    public static void main(String[] args) {

        ReentrantReadWriteLock lock=new ReentrantReadWriteLock();

        ReentrantReadWriteLock.ReadLock readLock=lock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock=lock.writeLock();




    }
}
