package javaConceptOfTheDay;

public class removeDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 3, 1, 4, 5, 6, 7 };
		removeDuplicateArray(arr);
	}

	public static void removeDuplicateArray(int inputArray[]) {
		int uniqueLength = inputArray.length;
		for (int i = 0; i < uniqueLength; i++) {
			for (int j = i + 1; j < uniqueLength; j++) {
				if (inputArray[i] == inputArray[j]) {
					inputArray[j] = inputArray[uniqueLength - 1];
					uniqueLength--;
					j--;
				}
			}
		}

		for (int k = 0; k < uniqueLength; k++) {
			System.out.print(inputArray[k] +" ");
		}
	}
}
