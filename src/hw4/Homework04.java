package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		int array1[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum1 = 0;
		for (int i = 0; i < array1.length; i++) {
			sum1 = sum1 + array1[i];
		}
		double avg = 0;
		avg = sum1 / array1.length;
		System.out.println("平均是" + avg);
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > avg) {
				System.out.println(array1[i] + "大於平均數");
			}
		}
//=========================================================第二題
		String s = "Hello world";
		System.out.println(s);
		StringBuilder strb = new StringBuilder(s);
		s = strb.reverse().toString();
		System.out.println(s);
		
//		String a = "Hello World!";
//		char b ;
//		for(int i = a.length() - 1; i >= 0; i--) {
//			b = a.charAt(i);
//			System.out.print(b);
//		}

//===========================================================第三題
		String planet[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char temp;
		int count = 0;
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length(); j++) {
				temp = planet[i].charAt(j);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					count++;
				}
			}
		}
		System.out.println("母音共出現了" + count + "次");
//==========================================================第三題
		int[][] creditors = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入:");
		money = sc.nextInt();
		System.out.println("可借錢的人有");
		for (int i = 1; i < creditors.length; i++) {
			for (int j = 0; j < creditors[i].length; j++) {
				if (money <= creditors[i][j]) {
					System.out.print(creditors[i - 1][j] + " ");
				}
			}
		}
		System.out.println("");
		sc.close();
//========================================================第六題
		int test[][] = { { 1, 10, 37, 100, 77, 98, 90 }, { 2, 35, 75, 70, 95, 70, 80 }, { 3, 40, 77, 79, 70, 89, 100 },
				{ 4, 100, 89, 90, 89, 90, 75 }, { 5, 90, 64, 75, 60, 75, 50 }, { 6, 85, 75, 70, 75, 90, 20 },
				{ 7, 75, 70, 79, 85, 89, 99 }, { 8, 70, 95, 90, 89, 90, 75 } };
		for(int i = 0; i < test.length; i++) {
			Arrays.sort(test[i]);
			System.out.println(test[i][0] + "同學最高分是" + test[i][6]);
		}
		
	}

}
