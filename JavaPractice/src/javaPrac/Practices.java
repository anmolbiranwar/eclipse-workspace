package javaPrac;

public class Practices {
	static int m1=80;
	int m2=90;
	
	static void sMethod()
	{
		System.out.println("Static method");
		
	}
	void nsMethod()
	{
		System.out.println("Non static method");
	}
	
	Practices()
	{
		System.out.println("Constructor method");
	}
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Non Static block");
	}
	public static void main(String[] args) {
		Practices p=new Practices();
		System.out.println(m1);
		System.out.println(p.m2);
		p.nsMethod();
		Practices.sMethod();
	}

}
