package hw5;

import java.util.Scanner;

public class Homework0501Test {
	public static void main(String[] args) {
		int weight = 0;
		int heigh = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬");
		if(sc.hasNextInt()) {
			weight = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("請輸入長");
		if(sc.hasNextInt()) {
			heigh = sc.nextInt();
		}
		Homework0501 hw = new Homework0501();
		hw.starSquare(weight, heigh);
		sc.close();
		
	}
	
	
	
}
