package algonomy;

public class BankImpl implements Bank {

    Double bankBalance = 0.0;

    @Override
    public Double showBalance() {
        return bankBalance;
    }

    @Override
    public Double debit(Double amount) {

        synchronized (this) {
            while (bankBalance < amount){
                try {
                    System.out.println("Balance lower than debit "+bankBalance);
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (bankBalance > amount) {
                System.out.println("Sufficient balance "+bankBalance);
                bankBalance = bankBalance - amount;
            }
        }

        return bankBalance;
    }

    @Override
    public Double credit(Double amount) {

        synchronized (this) {
            bankBalance = bankBalance + amount;
            this.notify();
        }

        return bankBalance;
    }
}
