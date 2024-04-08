package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		 System.out.print("Enter the value of y: ");
		int y = sc.nextInt();
		try{
			Calculator c = new Calculator();
			double res = c.powerXY(x, y);
			System.out.println("Result of " + x + "^" + y + " is: " + res);
		}catch(CalException cl ){
			System.out.println("Error: " + cl.getMessage());
		}finally {
			sc.close();
		}
	}
}
