package hw7;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class DataTest {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:\\javaHomework\\Data.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			Random random = new Random();
			int number;
			for(int i = 1; i <= 10; i++) {
				number = random.nextInt(1000) + 1;
				pw.println(number);
			}
			pw.close();
			bw.close();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
