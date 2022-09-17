import java.text.DecimalFormat;

public class SavingsAcc extends Account {

    private static double Rate;

    public SavingsAcc(int acc, double bal, double interest){
        super(acc, bal);
        Rate = interest;
        RunnableIntrest save = new RunnableIntrest(this);
        Thread thread1 = new Thread(save);
        thread1.start();
    }

    public void addInterest(){
        DecimalFormat Format = new DecimalFormat("#.00");
        accLock.lock();
        try{
            balance = balance + balance*(Rate/100);
        } finally {
            accLock.unlock();
        }
        if (Rate == 0) {

            System.out.println("Account balance with no Interest plan = " + Format.format(balance));
        }
        else
        {
            System.out.println("Account's new balance with specified Interest plan = " + Format.format(balance));
        }

    }
}