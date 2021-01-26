package Ptr_Day1;
public class QuadraticEquation {
public static void main(String[]args) {
	int a = 1;
	int b = 2;
	int c = 3;
	double ans = b*b - 4*a*c;
	if(ans>0.0) {
		double root1 = (-b + Math.sqrt(ans))/ (2*a);
		double root2 = (-b - Math.sqrt(ans))/ (2*a);
		System.out.println("The roots are: "+ root1+","+root2);
	}
	else if(ans==0.0) {
		double root = -b/(2*a);
		System.out.println("The root is: "+root);
	}
	else {
		System.out.println("No roots");
	}
}
}