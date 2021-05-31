package string;

import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args) {
		int n;
		System.out.print("enter No of character :");
		java.util.Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		a[0] = 0;
		a[1] = 1;
		System.out.println("");
		System.out.print(a[0] + "," + a[1]);
		for (int i = 2; i < n; i++) {
			a[i] = a[i - 2] + a[i - 1];
			System.out.print("," + a[i]);
		}
	}
}
