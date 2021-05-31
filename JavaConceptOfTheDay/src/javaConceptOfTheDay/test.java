package javaConceptOfTheDay;

import java.util.HashMap;

public class test {
	public static void main(String[] args) {
		String s1 = "Dormitory";
		String s2 = "dirty Room";
		anagram(s1, s2);
	}

	public static void anagram(String one, String two) {
		one = one.replaceAll("\\s+", "");
		two = two.replaceAll("\\s+", "");
		boolean flag = true;
		HashMap<Character, Integer> hm = new HashMap<>();
		if (one.length() == two.length()) {
			for (int i = 0; i < one.length(); i++)
				if (hm.containsKey(one.charAt(i))) {
					hm.put(one.charAt(i), hm.get(one.charAt(i)) + 1);
				} else
					hm.put(one.charAt(i), 1);
			for (int j = 0; j < two.length(); j++) {
				if (hm.containsKey(one.charAt(j))) {
					hm.put(one.charAt(j), hm.get(one.charAt(j)) - 1);
				} else {
					flag = false;
				}
			}
		} else {
			flag = false;
		}
		for (int k : hm.values()) {
			if (k != 0) {
				flag = false;
			}
		}
		if (flag == true)
			System.out.println("strings Are anagram");
		else
			System.out.println("strings are not an anagram");
	}
}
