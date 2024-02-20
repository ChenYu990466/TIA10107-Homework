package hw4;

public class Homework4 {
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
	}
}
