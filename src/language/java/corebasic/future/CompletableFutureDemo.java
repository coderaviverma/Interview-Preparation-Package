package language.java.corebasic.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->"Hello World");
//        CompletableFuture<String> completableFuture=CompletableFuture.
//                                                    supplyAsync(()->"Hello World")
//                                                    .thenApply(o->"")
//                                                    .thenAccept();

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


}
