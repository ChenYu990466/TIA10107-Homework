package hw6;

public class Calculator {
	public  double powerXY(int x , int y) throws CalException{
		if(x == 0 && y == 0) {
			throw new CalException("x y 不可同時為零");
		}
		if(y < 0) {
			throw new CalException("y不可以是負數");
		}
		double res = Math.pow(x,y);
		
		return res;
	}
}
