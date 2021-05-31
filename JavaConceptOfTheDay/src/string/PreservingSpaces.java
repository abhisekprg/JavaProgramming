package string;

public class PreservingSpaces {
	public static void main(String[] args) {
		String s1 = "I am not strings";
		char[] c1 = new char[s1.length()];
		int j = s1.length() - 1;
		System.out.println(j);
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				c1[i] = ' ';
			} else {
				if (s1.charAt(j) == ' ') {
					j--;
				}
				c1[i] = s1.charAt(j);
				j--;

			}
		}
		String s2 = String.valueOf(c1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
