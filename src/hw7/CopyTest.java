package hw7;

public class CopyTest {
	public static void main(String[] args) {
		String File1 = "c:\\javaHomework\\Data1.txt" ;
		String File2 = "c:\\javaHomework\\Data2.txt";
		Copy c = new Copy();
		c.copyFile(File1, File2);
		
	}
}
