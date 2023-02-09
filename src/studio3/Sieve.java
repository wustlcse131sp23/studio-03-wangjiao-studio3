package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] sieve = new int[n];
		for (int i=0; i<n; i++) {
			sieve[i] = 1+i;
		}
		for (int q = 2; q < n; q++) {
			for (int p=2*q-1; p<n; p+=q) {
				sieve[p] = 0;
			}
			
		}
		for (int r = 0; r< n; r++) {
			if (sieve[r]!= 0) {
				System.out.println(sieve[r]);
			}
		}
	}

}
