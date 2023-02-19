package prashantSir;

public class MarriageApp {
	void checkEligibility(String name, int age)
	{
		if(age>=21)
		{
			System.out.println(name+" "+age+":"+"Eligible for marriage!");
		}
		else 
		{
			System.out.println(name+" "+age+":"+"Not Eligible for marriage!");
		}
		
	}
	public static void main(String[] args) {
		MarriageApp obj=new MarriageApp();
		obj.checkEligibility("Anmol", 20);
		obj.checkEligibility("Prajwal",22);

	}

}
