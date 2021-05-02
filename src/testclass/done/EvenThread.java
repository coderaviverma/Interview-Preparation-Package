package testclass.done;

public class EvenThread implements Runnable{


    private Object lock;
    private volatile int count;
    private int n=0;

    public EvenThread(int n,int count,Object lock){
        this.lock=lock;
        this.count=count;
        this.n=n;
    }

    @Override
    public void run() {

        synchronized (lock){

            for (int i = 0; i < n; i++) {
                count++;

                if (count%2==0){
                    System.out.println("Even - "+count+" - "+Thread.currentThread().getName());
                    lock.notify();
                }else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }

        }




    }
}
