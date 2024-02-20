package hw1;

public class Homework01 {

	public static void main(String[] args) {
//*************************************第一題
		int i = 12, j = 6;
		System.out.println(i + j);
		System.out.println(i * j);
//*************************************第二題
		int egg = 200;
		System.out.println("一共有" + egg / 12 + "打蛋和" + egg % 12 + "顆蛋");
//*************************************第三題
		int day = 256559 / (60 * 60 * 24);
		int hr = (256559 % (60 * 60 * 24)) / (60 * 60);
		int mi = ((256559 % (60 * 60 * 24)) % (60 * 60)) / 60;
		int sec = (((256559 % (60 * 60 * 24)) % (60 * 60)) % 60);
		System.out.println(day + "天" + hr + "小時" + mi + "分" + sec + "秒");
//*************************************第四題
		final double PI = 3.1415;
		System.out.println("圓面積為" + 5 * 5 * PI);
		System.out.println("圓周長為" + 2 * 5 * PI);
//*************************************第五題
		double money = (1 + 0.02 / 12);
		System.out.println(1500000 * Math.pow(money, 10));
//*************************************第六題
		System.out.println(5 + 5);
		//數字相加 5 + 5 = 10
		System.out.println(5 + '5');
		//'5'會被視為字符的 ASCII 值 ASCII值'5'為53 因此 5 + 53 = 58
		System.out.println(5 + "5");
		//"5"是字串 因此顯示數字5+字串5 結果:55
	}

}
