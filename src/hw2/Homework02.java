package hw2;

public class Homework02 {
	public static void main(String[] args) {
//************************************第一題		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
//***********************************第二題
		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 = sum2 * i;
		}
		System.out.println(sum2);
//***********************************第三題
		int sum3 = 1;
		int number3 = 1;
		while (number3 <= 10) {
			sum3 = sum3 * number3;
			number3++;
		}
		System.out.println(sum3);
//************************************第四題
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i);
			System.out.print(" ");
		}
		System.out.println(" ");
//*********************************第五題
		int sum5 = 0;
		for (int ten = 0; ten <= 4; ten++) {
			for (int ones = 0; ones <= 9; ones++) {
				if (ten != 4 && ones != 4 && ten + ones != 0) {
					System.out.print(ten * 10 + ones + " ");
					sum ++;
				}
			}
		}
		System.out.println("總共有" + sum + "個數字可以選");
//*********************************第六題		
		for (int j = 10; j > 0; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
//**********************************第七題
		for (char alph = 'A'; alph <= 'F'; alph++) {
			for (int i = 1; i <= (alph - 'A' + 1); i++) {
				System.out.print(alph);
			}
			System.out.println();
		}
	}

}
