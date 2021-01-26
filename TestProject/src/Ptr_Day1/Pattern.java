package Ptr_Day1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to form a pattern");
		int n = sc.nextInt();
		int val = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				val++;
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}