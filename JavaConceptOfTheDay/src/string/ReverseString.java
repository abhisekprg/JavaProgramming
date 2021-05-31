package string;

public class ReverseString {

	public static void main(String[] args) {
		String S1 = "abcdefg";
		char[] a = new char[S1.length()];
		int count = 0;
		System.out.println(S1);
		System.out.print("the reverse string is ");
		for (int i = S1.length() - 1; i >= 0; i--) {
			char S2 = S1.charAt(i);
			System.out.print(S2);
		}
	}

}
