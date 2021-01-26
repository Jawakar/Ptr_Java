package Ptr_Day1;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int a;
		a= sc.nextInt();
		int switchInp ;
		if(a>100) {
			switchInp = 1;
		}
		else {
			switchInp = 2;
		}
		switch(switchInp) {
		case 1:
			System.out.println(a+5);
			break;
		case 2:
			System.out.println(a-5);
			break;
		}
	}

}
