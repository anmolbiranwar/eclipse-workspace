package testpackage;

public class LogicalOperators {

	public static void main(String[] args) {
		//Person should get credit card only when salary is greater than or equal to 30K and also having credit score more than 750
		
		int creditScore = 751;
		int salary = 30000;
		int age = 17;
		
		if((creditScore > 750 && salary>=30000) && age>=18 ) {
			System.out.println("Generate Credit Card");
		}else {
			System.out.println("Not Eligible for Credit Card");
		}
	}

}
