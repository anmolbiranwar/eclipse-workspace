package testpackage;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 99;
		
		System.out.println("while loop");


		while (i > 100) {
			System.out.println("ABC");
			i++;
		}
		
		System.out.println("do-while loop");

		do {
			System.out.println("ABC");
			i++;
		} while (i > 100);

	}

}
