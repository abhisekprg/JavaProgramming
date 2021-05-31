package javaConceptOfTheDay;

public class SubArrayMaxThird {

	private static void subArray(int[] A) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
			if (sum > maxSum) {
				maxSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println("the maximum sum is " + maxSum);

	}

	public static void main(String[] args) {
		int arr[] = { -5, 8, 9, -6, 10, -15, 3 };
		subArray(arr);
	}
}
