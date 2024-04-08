package hw5;

import java.security.SecureRandom;

public class AuthCodeGenerator {
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public static String genAuthCode() {
		StringBuilder authCode = new StringBuilder();
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < 8; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			authCode.append(CHARACTERS.charAt(randomIndex));
		}

		return authCode.toString();
	}

}
