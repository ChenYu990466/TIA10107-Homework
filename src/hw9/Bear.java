package hw9;

public class Bear implements Runnable{
    private Account account;

    public Bear(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdrawFromMom(); // 熊大提款
        }
    }
}


