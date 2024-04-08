package hw5;

public class Homework0502 {
	public static void randAvg() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum / 10);
	}
	public static void main(String[] args) {
		randAvg();
	}
}
