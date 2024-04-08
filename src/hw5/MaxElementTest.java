package hw5;

public class MaxElementTest {
	public static void main(String[] args) {
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		double[][] doubleArray = {
				{1.2,3.5,2.2},
				{7.4,2.4,8.2}
		};
		MaxElement m = new MaxElement();
		System.out.println(m.maxElement(intArray));
		System.out.println(m.maxElement(doubleArray));
	}
}
