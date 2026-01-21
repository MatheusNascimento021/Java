import java.util.Scanner;
 
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee x = new Employee();
		
		System.out.print("Name:");
		x.name = sc.nextLine();
		System.out.print("Gross salary:");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		x.tax = sc.nextDouble();
		
		double netSalary = x.netSalary();
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n",x.name,x.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		
		
	    x.increaseSalary(percentage);
	    
		System.out.println();
		System.out.printf("Update data: %s, $ %.2f%n", x.name, x.netSalary());
		
		sc.close();

	}

}
