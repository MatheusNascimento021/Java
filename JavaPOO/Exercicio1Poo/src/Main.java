import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle x = new Rectangle();
		
		
	
		System.out.println("Enter rectangle width and height");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double area = x.area();
		double perimeter = x.perimeter();
		double diagonal = x.diagonal();
		
		System.out.printf("AREA = %.2f%n",area );
		System.out.printf("PERIMETER = %.2f%n",perimeter);
		System.out.printf("DIAGONAL = %.2f%n",diagonal);
		
		
		
		sc.close();

	}

}
