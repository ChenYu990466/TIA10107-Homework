package hw9;

import java.util.Random;

public class Competitor implements Runnable {
	private String name;
	private Random random;

	public Competitor(String name) {
		this.name = name;
		this.random = new Random();
	}

	public int getRandomSleepTime() {
		return random.nextInt(2500) + 500;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(name + " 吃第 " + i + " 頓飯");
				int sleepTime = getRandomSleepTime(); // 500~3000毫秒之間的亂數
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " 吃完了!");
	}
}
