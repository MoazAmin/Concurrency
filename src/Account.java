import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    protected double balance;
    private int accountNo;
    protected Lock accLock;
    private Condition accCondition;

    public Account(int accNo, double bal) {
        this.accountNo = accNo;
        balance = bal;
        accLock = new ReentrantLock();
        accCondition = accLock.newCondition();
    }

}