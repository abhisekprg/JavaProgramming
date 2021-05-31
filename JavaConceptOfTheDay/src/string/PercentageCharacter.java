package string;

public class PercentageCharacter {
	public static void main(String[] args) {
		String s = "There is 100 Dark fox @ jumpiNG";
		characterCheck(s);
	}

	public static void characterCheck(String s1) {
		int upperCase = 0;
		int lowerCase = 0;
		int digit = 0;
		int specialChar = 0;
		String s2 = s1.replaceAll("\s", "");
		char[] ch = s2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				upperCase++;
			} else if (Character.isLowerCase(ch[i])) {
				lowerCase++;
			} else if (Character.isDigit(ch[i])) {
				digit++;
			} else {
				specialChar++;
			}
		}
		System.out.println(s1);
		System.out.println("uppercase: " + upperCase + " LowerCase: " + lowerCase + " Digit: " + digit
				+ " specialcharacter: " + specialChar);
	}
}
