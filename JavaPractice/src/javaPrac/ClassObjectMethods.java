package javaPrac;

public class ClassObjectMethods {

	int empId;
	String empName;
	int salary;
	int depNo;

	/*
	 * ClassObjectMethods(int id, String name, int sal, int dno) { empId=id;
	 * empName=name; salary=sal; depNo=dno; }
	 */

	void setdata(int id, String name, int sal, int dno) {
		empId = id;
		empName = name;
		salary = sal;
		depNo = dno;

	}

	void Display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(depNo);
		System.out.println();
	}

	public static void main(String[] args) {

		// Assigning values to class variables using object -First Method

		/*
		 * ClassObjectMethods Emp1=new ClassObjectMethods(); Emp1.empId=1;
		 * Emp1.empName="Anmol"; Emp1.salary=50000; Emp1.depNo=10; Emp1.Display();
		 * 
		 * ClassObjectMethods emp2=new ClassObjectMethods(); emp2.empId=2;
		 * emp2.empName="Biranwar"; emp2.salary=40000; emp2.depNo=11; emp2.Display();
		 */

		/*
		 * //Assining values to class variables using constructor- Second Method
		 * ClassObjectMethods Emp3=new ClassObjectMethods(3,"Pruthviraj",55000,12);
		 * Emp3.Display();
		 * 
		 * ClassObjectMethods Emp4=new ClassObjectMethods(4,"Laxmi",60000,13);
		 * Emp4.Display();
		 */
		// Assigning values to class variables using method--Third Method
		ClassObjectMethods Emp5 = new ClassObjectMethods();
		Emp5.setdata(6, "Ashvini", 70000, 15);
		Emp5.Display();
	}

}
