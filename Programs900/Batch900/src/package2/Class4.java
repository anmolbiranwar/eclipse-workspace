package package2;

public class Class4 extends Class3 {

	String Name = "Selenium";

	public void printName(String Name) {
		System.out.println(Name);
		System.out.println(this.Name);
		System.out.println(super.Name);
	}

	public static void main(String[] args) {
		new Class4().printName("XYZ");
	}

}
