package Ptr_Day1;

import java.util.Scanner;

public class GetPositiveAndNegative {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	System.out.println((n>0)?n+" is a positive number":n+" is a negative number");
}
}