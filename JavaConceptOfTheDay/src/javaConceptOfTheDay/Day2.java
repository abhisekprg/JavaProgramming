package javaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Day2 {

	public static void main(String[] args) {
		String str1 = "Everyday is a wonderfull day day";
		String workToBeConstructed = "day";
		// Map<Character, Integer> countStr1 = countChar(str1);
		// Map<Character, Integer> countStr2 = countChar(workToBeConstructed);

		Map<Character, Integer> countStr1 = new HashMap<>();
		for (char c : workToBeConstructed.toCharArray()) {
			for (char ch : str1.toCharArray()) {

				if (ch == c)
					if (countStr1.containsKey(c)) {
						countStr1.put(c, countStr1.get(c) + 1);
					} else {
						countStr1.put(c, 1);
					}
			}
		}

		int min = countStr1.get(workToBeConstructed.charAt(0));
		for (Entry<Character, Integer> key : countStr1.entrySet()) {

			int res = key.getValue();
			if (res < min) {
				min = res;
			}
		}

		System.out.println("max no of string can be created =" + min);

	}

	static Map<Character, Integer> countChar(String str1) {
		Map<Character, Integer> countStr1 = new HashMap<>();
		for (char ch : str1.toCharArray()) {
			if (countStr1.containsKey(ch)) {
				countStr1.put(ch, countStr1.get(ch) + 1);
			} else {
				countStr1.put(ch, 1);
			}
		}
		return countStr1;
	}

}
