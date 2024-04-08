package hw4;
import java.util.Scanner;
public class Homework0405 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			int years = sc.nextInt();
			int months = sc.nextInt();
			if(months == 0 || months > 12) {
				System.out.println("月份輸入錯誤");
				break;
			}
				
			int days = sc.nextInt();
			if(days == 0) {
				System.out.println("日期輸入錯誤");
				break;
			}
			else if(months % 2 != 0 && days >31) {
				System.out.println("日期輸入錯誤");
				break;
			}
			else if(months == 2 && years % 4 != 0 && days > 28) {
				System.out.println("日期輸入錯誤");
				break;
			}
			else if(months == 2 && years % 4 == 0 && days > 29) {
				System.out.println("日期輸入錯誤");
				break;
			}
			else if(months == 8 && days > 31) {
				System.out.println("日期輸入錯誤");
				break;
			}
			else if (months % 2 == 0 && days >30) {
				System.out.println("日期輸入錯誤");
				break;
			}
			System.out.println("正確");
			
			CalculatorDay d = new CalculatorDay();
			int sum = d.Calculator(years,months,days);
			System.out.println(sum + days);	
			System.out.println(sum);
			System.out.println(days);
		}
	}
	
}
