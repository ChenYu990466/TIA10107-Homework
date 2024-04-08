package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copy {
	public void copyFile(String x, String y) {
		String i;
		try {
			FileReader fr = new FileReader(x);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(y,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			while((i = br.readLine()) != null) {
				pw.println(i);
			}
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
