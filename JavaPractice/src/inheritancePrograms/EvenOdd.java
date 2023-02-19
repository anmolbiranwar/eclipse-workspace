package inheritancePrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int n;
			System.out.println("Enter any number : ");
			Scanner s = new Scanner(System.in);
			n = s.nextInt();

			if (n % 2 == 0) {
				System.out.println(n+" is Even number");
				System.out.println("---------------------------");
			} else {
				System.out.println(n+" is Odd number");
				System.out.println("---------------------------");
			}
			
		}
		
	}

}
