package string;

import java.util.HashMap;

public class AnagramUsingMap {
	public static void main(String[] args) {
		String S1 = "The ClassRoom";
		String S2 = "School Master";
		String copyS1 = S1.replaceAll("\\s", "").toLowerCase();
		String copyS2 = S2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		int countChar;
		if (copyS1.length() == copyS2.length()) {
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < copyS1.length(); i++) {
				char charInS1 = copyS1.charAt(i);
				char charInS2 = copyS2.charAt(i);
				if (map.containsKey(charInS1))
					countChar = map.get(charInS1);
				else
					countChar = 0;

				map.put(charInS1, ++countChar);

				if (map.containsKey(charInS2))
					countChar = map.get(charInS2);
				else
					countChar = 0;
				
				map.put(charInS2, --countChar);
			}
			for (int value : map.values()) {
				if (value != 0)
					status = false;
			}
			if (status)
				System.out.println("the strings are amagram");
			else
				System.out.println("the strings are not amagram");
		} else
			System.out.println("the strings are not amagram");
	}
}
