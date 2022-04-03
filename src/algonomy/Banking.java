package algonomy;

public class Banking {
/*
 There is a bank account and if the balance is less than the amount you are trying to withdraw means the transaction
 should get blocked. Once the balance is more than the withdraw amount then it should continue.
* */
    public static void main(String[] args) {
        //Banking Acoount
        //Show balance
        //debit
        //credit

        Bank bank=new BankImpl();

        System.out.println("show balance "+bank.showBalance());

        Thread t1=new Thread(new TransactionRunnable(bank));
        t1.start();
        System.out.println("Trying to debit");
        System.out.println("show debit "+bank.debit(10.0));


    }
}
