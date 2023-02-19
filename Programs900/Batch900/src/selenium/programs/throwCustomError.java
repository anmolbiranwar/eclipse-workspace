package selenium.programs;

public class throwCustomError {

	public static void main(String[] args) {
		
		int age = 10;
		
		if (age<18) {			
			throw new ArithmeticException("Not Eligile to Vote");
		}else {
			System.out.println("Eligible to Vote");
		}

		System.out.println("Execution is completed");
	}

}
