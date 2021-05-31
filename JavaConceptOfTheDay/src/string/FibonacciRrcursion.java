package string;

import java.util.Scanner;

public class FibonacciRrcursion {
	static int firstTerm = 0, SecondTerm = 1;

	public static void main(String[] args) {
		int n;
		System.out.print("eneter number of character : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("");
		System.out.print(0 + "," + 1);
		fibo(n - 2);
	}

	public static void fibo(int n1) {
		if (n1 > 0) {
			int ThirdTerm = firstTerm + SecondTerm;
			firstTerm = SecondTerm;
			SecondTerm= ThirdTerm;
			System.out.print("," + ThirdTerm);
			fibo(n1 - 1);
		}
	}
}
