package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) {
		String s;
		int byteCount = 0;
        int charCount = 0;
        int lineCount = 0;
		try {
			FileReader fr = new FileReader("c:\\javaHomework\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while((s = br.readLine()) != null) {
				byteCount = s.getBytes().length;
				charCount = s.length();
				lineCount++;
			}
			br.close();
			fr.close();
			System.out.println("Sample.txt檔案共有" + byteCount +"個位元組" + charCount + "個字元" + lineCount+ "列資料");
			
		}catch(IOException e){}
		
	}
}
