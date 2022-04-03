package algonomy;

public class TransactionRunnable implements Runnable{

    private Bank bank;

    public TransactionRunnable(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        System.out.println("Credit thread start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        bank.credit(100.0);
        System.out.println("show credit "+bank.credit(100.0));

    }
}
