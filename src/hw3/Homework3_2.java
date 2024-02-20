package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		int i = (int) (Math.random() * 101) + 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("猜數字");
		while (true) {
			int x = sc.nextInt();
			if (x < i) {
				System.out.println("猜大一點");
			} else if (x > i) {
				System.out.println("猜小一點");
			} else {
				System.out.println("恭喜猜中");
				break;
			}
		}
	}

}
