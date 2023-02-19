package javaPrac;

public class StudentMarks {
	static int i=10;
	int i1=15;
	
	static void m1()
	{
		System.out.println("Static method");
	}
	void m2()
	{
		System.out.println("NonStatic method");
	}

	public static void main(String[] args) {
		StudentMarks s=new StudentMarks();
		System.out.println(i);
		System.out.println(s.i1);
		System.out.println(s.i);
		System.out.println(new StudentMarks().i);
		
		

	}

}
