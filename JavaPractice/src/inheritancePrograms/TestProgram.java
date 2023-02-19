package inheritancePrograms;


class Student
{
	void stud()
	{
	System.out.println("I am a Boy.");
	}
	
}
class States extends Student
{
	void stat(String name, int age, String color, String sex)
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(sex);
	}
}

public class TestProgram {

	public static void main(String[] args) {
		States s=new States();
		s.stud();
		s.stat("Anmol",23, "fair","male");
		s.stat("Prajwal", 24, "medium","Male");

	}

}
