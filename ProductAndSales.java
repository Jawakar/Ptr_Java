package Day_3;
import java.util.Scanner;
class EmployeeDetails{
	String Emp_name;
	String Emp_designation;
	int Emp_id;
	int Salary;
	EmployeeDetails(){
	}
	public EmployeeDetails(String Emp_name, String Emp_designation, int Emp_id, int Salary) {
		this.Emp_name = Emp_name;
		this.Emp_designation = Emp_designation;
		this.Emp_id = Emp_id;
		this.Salary = Salary;
	}
	void display() {
		System.out.format("%20s %20s %20s",Emp_id,Emp_name,Emp_designation,Salary);
		System.out.println();
	}
}

public class ProductAndSales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int empNo = sc.nextInt();
		System.out.println("Enter the details of employees as per the requirements");
		EmployeeDetails edClassObj = new EmployeeDetails();
		EmployeeDetails [] ed = new EmployeeDetails[empNo];
		for(int i=0; i<empNo; i++) {
			System.out.println("Enter the name of the employee: ");
			String name = sc.next();
			System.out.println("Enter the designation: ");
			String designation = sc.next();
			System.out.println("Enter the ID: ");
			int id = Integer.parseInt(sc.next());
			System.out.println("Enter the salary: ");
			int salary = Integer.parseInt(sc.next());
			ed[i] = new EmployeeDetails(name,designation,id,salary);
		}
		System.out.printf("%20s %20s %20s","Emp_Id","Emp_Name","Emp_designation","Emp_salary");
		System.out.println();
		for(int i=0; i<empNo; i++) {
			ed[i].display();
		}
	}	
}
