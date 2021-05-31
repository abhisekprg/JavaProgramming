package string;

public class ReverseStringUsingRecursive {

	public static void main(String[] args) {

		String s = "abcdef";
		System.out.println(recursive(s));
	}

	static String recursive(String s1) {
		if(s1==null ||s1.length()<=1)
		{
			return s1;
		}
		return recursive(s1.substring(1, s1.length()))+s1.charAt(0);
// either return recursive(s1.substring(1)) + s1.charAt(0);
	}
}

