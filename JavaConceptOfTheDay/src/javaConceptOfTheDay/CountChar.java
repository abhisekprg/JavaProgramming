package javaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountChar {

	public static void main(String[] args) {

		String str1 = "Everyday is a wonderfull day".toLowerCase();
		String workToBeConstructed = "Day".toLowerCase();
		Map<Character, Integer> countStr1 = countChar(str1);
		Map<Character, Integer> countStr2 = countChar(workToBeConstructed);

		int min = countStr1.get(workToBeConstructed.charAt(0)) / countStr2.get(workToBeConstructed.charAt(0));
		for (int i = 1; i < workToBeConstructed.length(); i++) {

			if (Objects.isNull(countStr1.get(workToBeConstructed.charAt(i)))) {
				min = 0;
				break;
			}
			int res = countStr1.get(workToBeConstructed.charAt(i)) / countStr2.get(workToBeConstructed.charAt(i));
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
