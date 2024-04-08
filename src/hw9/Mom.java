package hw9;

public class Mom implements Runnable{
    private Account account;

    public Mom(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.transferToBear(); // 媽媽匯款給熊大
        }
    }
}
