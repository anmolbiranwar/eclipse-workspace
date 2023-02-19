package inheritancePrograms;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {
			int i, fact = 1;
			int n;
			System.out.println("Enter any number :");

			Scanner s = new Scanner(System.in);
			n = s.nextInt();

			for (i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + n + " is:" + fact);
			System.out.println("------------------------------");
		}
	}

}
