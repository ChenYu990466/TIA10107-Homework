package hw3;
import java.util.Scanner;
public class Homework3_1 {
	public static void main(String[] args){
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入三個數字");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int[]array = new int[]{x,y,z};
			for(int i = 0; i < array.length; i ++) {
				for(int j = i + 1; j < array.length; j ++) {
					if(array[i] > array[j]) {
						int k = array[i];
						array[i] = array[j];
						array[j] = k;
					}
				}
			}
			if(array[0] + array[1] > array[2]) {
				if(array[0] * array[0] + array[1] * array[1] == array[2]) {
					if(array[0] == array[1]) {
						System.out.println("是等腰直角三角形");
					}
					System.out.println("是直角三角形");
				}
				else if(array[0] == array[2]) {
					System.out.println("是正三角形");
				}
				else if(array[0] != array[1] && array[1] != array[2]) {
					System.out.println("是三角形");
				}
				else if(array[0]== array[1]) {
					System.out.println("是等腰三角形");
				}
			}
			else{
				System.out.println("不是三角形");	
			}
			System.out.println(" ");	
		}
	}
}
