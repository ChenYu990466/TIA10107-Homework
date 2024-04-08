package hw4;

public class CalculatorDay {

	
	public int Calculator (int year,int month, int day) {
		int sumdays = 0;
		if (month == 1) {
			sumdays += 0;
		}
		else {
			for(int i = 1; i < month ; i++) {
				
				if(i % 2 != 0) {
					sumdays += 31;
				}
				else if(i == 2 && year % 4 == 0) {
					sumdays += 29;
				}
				else if(i == 2 ) {
					sumdays += 28;
				}
				else if(i == 8 ) {
					sumdays += 31;
				}
				else{
					sumdays += 30; 
				}
				
			}
		}
		return  sumdays ;
	}
}
