package algonomy;

public interface Bank {

    Double showBalance();
    Double debit(Double amount);
    Double credit(Double amount);
}
