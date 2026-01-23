import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			int num = sc.nextInt();
			
			int soma = 0;
			for(int j=1; j<num; j++) {
				if(num % j == 0) {
					soma+=j;
				}
				
			}
			if(soma == num) {
				System.out.println(num + " eh perfeito");
			}
			else {
				System.out.println(num + " nao eh perfeito");
			}
		}
		
		sc.close();

	}

}
