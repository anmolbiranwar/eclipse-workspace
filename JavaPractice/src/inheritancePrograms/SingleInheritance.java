package inheritancePrograms;

class Parent{
	int money=5000;
	String s="Bike";
	
}
public class SingleInheritance extends Parent{
	void m() {
		System.out.println("Papa is giving me "+money+"rupees and "+s);
		}
	public static void main(String[] args) {
		SingleInheritance obj=new SingleInheritance();
		obj.m();
	}

}
