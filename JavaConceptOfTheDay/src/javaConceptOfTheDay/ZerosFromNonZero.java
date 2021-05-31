package javaConceptOfTheDay;

import java.util.Arrays;

public class ZerosFromNonZero {

	static void zero(int[] input) {
		int count = 0;
		int z = input.length;
		int counter = 0;
		for (int i = 0; i < z; i++) {
			if (input[i] == 0) {
				count++;
			}
			else {
				input[counter] = input[i];
				counter++;
			}
		}
		while (counter < z) {
			input[counter] = 0;
			counter++;
		}
		System.out.println("total zeros= " + count);
		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {
		int arr[] = { 7, 0, 9, 8, 0, 5, 6, 9, 0 };
		System.out.println(Arrays.toString(arr));
		zero(arr);
	}
}
