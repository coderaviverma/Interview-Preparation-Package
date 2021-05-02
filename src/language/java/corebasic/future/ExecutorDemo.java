package language.java.corebasic.future;

import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) {

//        ExecutorService executorService= new Thread
        ExecutorService executor = Executors.newFixedThreadPool(10);
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        ExecutorService executor = Executors.newCachedThreadPool();
//        ExecutorService executor = Executors.newScheduledThreadPool();


        Future<Integer> future=executor.submit(new CallableDemo());

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
