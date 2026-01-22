import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name:");
		student.name = sc.nextLine();
		System.out.print("GRADE 1:");
		student.grade1 = sc.nextDouble();
		System.out.print("GRADE 2:");
		student.grade2 = sc.nextDouble();
		System.out.print("GRADE 3:");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n",student.finalGrade());
        
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS" , student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}

		
		sc.close();

	}

}
