package inheritancePrograms;

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank //Overriden
{
	int getRateOfInterest()
	{
		return 10;
	}
}
class ICICI extends Bank  //Overriden
{
	int getRateOfInterest()
	{
		return 15;
	}
}
class AXIS extends Bank   //Overriden
{
	int getRateOfInterest()
	{
		return 12;
	}
}

public class OverridingProgram {

	public static void main(String[] args)
	{
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateOfInterest());  //10
		
		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getRateOfInterest());  //15
		
		AXIS axisobj=new AXIS();
		System.out.println(axisobj.getRateOfInterest());   //12
	}

}
