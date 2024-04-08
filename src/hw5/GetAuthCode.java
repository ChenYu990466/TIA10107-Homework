package hw5;

public class GetAuthCode {
	public static void main(String[] args) {
		
		 String authCode = AuthCodeGenerator.genAuthCode();
	        System.out.println("生成的驗證碼: " + authCode);
	}
}
