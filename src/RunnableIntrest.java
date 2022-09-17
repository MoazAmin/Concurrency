public class RunnableIntrest implements Runnable {

    SavingsAcc account;

    public RunnableIntrest(SavingsAcc savingsAccount) {
        account = savingsAccount;
    }

    @Override
    public void run() {
        while(true){
            account.addInterest();
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}