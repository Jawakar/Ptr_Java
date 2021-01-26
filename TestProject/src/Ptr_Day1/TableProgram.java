package Ptr_Day1;

import java.util.Scanner;

public class TableProgram {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting point");
		int start = sc.nextInt();
		System.out.println("Enter ending point");
		int end = sc.nextInt();
		System.out.println("Enter the multiple");
		int multiple = sc.nextInt();
		for(int i=start; i<=end; i++) {
			System.out.println(multiple+" x "+i+" = "+multiple*i);
		}
	}
}
