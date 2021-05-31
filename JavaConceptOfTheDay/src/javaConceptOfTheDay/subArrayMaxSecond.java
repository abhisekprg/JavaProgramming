package javaConceptOfTheDay;

public class subArrayMaxSecond {

	public static void subArray(int[] A) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			int sum = A[i];
			for (int j = i + 1; j < A.length; j++) {

				sum = sum + A[j];
				if (Math.abs(sum) > Math.abs(maxSum)) {
					maxSum = sum;
				}
			}
		}
		System.out.println("the maximum sum is " + maxSum);

	}

	public static void main(String[] args) {
		int arr[] = { -5, 8, 9, -6, 10, -15, 3 };
		subArray(arr);

	}

}
