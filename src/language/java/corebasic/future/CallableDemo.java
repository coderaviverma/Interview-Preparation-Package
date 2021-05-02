package language.java.corebasic.future;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 12;
    }
}
