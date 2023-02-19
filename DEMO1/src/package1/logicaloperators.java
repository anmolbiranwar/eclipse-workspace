package package1;

public class logicaloperators {
	public static void main(String []args) {
		//guy should get credit card only when salary is greater than or equal to 30k and also having credit score more than 750
		
		int creditScore=750;
		int salary=30000;
		
		if(creditScore>750 && salary>=30000) {
			System.out.println("Generate Credit Card");
		}else {
			System.out.println("Not Eligible for Credit Card");
		}
		
		if(creditScore>750 || salary>=30000) {
			System.out.println("Generate Credit Card");
		}else {
			System.out.println("Not Eligible for Credit Card");
		}
	}

}
