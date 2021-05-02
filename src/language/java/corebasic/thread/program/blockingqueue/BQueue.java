package language.java.corebasic.thread.program.blockingqueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BQueue<E> {

    private List<E> queue=new LinkedList<>();

    private int limit=10;

    public BQueue(int limit){
        this.limit=limit;
    }

    public synchronized void enqueue(E item) throws InterruptedException{

        while (this.queue.size()==limit){
            wait();
        }
        if (this.queue.size()==0){
            notifyAll();
        }
         queue.add(item);
    }

    public synchronized E dequeue() throws InterruptedException{

        while (this.queue.size()==0){
            wait();
        }
        if (this.queue.size()==limit){
            notifyAll();
        }

        return this.queue.remove(0);
    }

}
