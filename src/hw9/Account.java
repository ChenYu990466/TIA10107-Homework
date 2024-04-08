package hw9;

public class Account {
	private int balance = 0;

	// 媽媽匯款給熊大的方法
	public synchronized void transferToBear() {
		while (balance >= 3000) {
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += 2000;
		System.out.println("媽媽匯款 2000 元給熊大，帳戶餘額為 " + balance + " 元");
		notify(); 
	}

	// 熊大提款的方法
	public synchronized void withdrawFromMom() {
		while (balance < 2000) {
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= 1000;
		System.out.println("熊大提款 1000 元，帳戶餘額為 " + balance + " 元");
		notify(); 
	}
}
