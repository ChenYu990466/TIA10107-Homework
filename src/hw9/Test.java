package hw9;

public class Test {
	public static void main(String[] args) {
        Account account = new Account(); // 創建一個帳戶物件

        // 創建媽媽和熊大的執行緒並啟動
        Thread momThread = new Thread(new Mom(account));
        Thread bearThread = new Thread(new Bear(account));

        momThread.start();
        bearThread.start();
    }
}
