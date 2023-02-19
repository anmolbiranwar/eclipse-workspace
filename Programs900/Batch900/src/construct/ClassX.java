package construct;

public class ClassX {
	
	String name = "Selenium";
	
	ClassX(String Name){
		name = Name;
	}
	
	ClassX(String Name, String age){
		name = Name+123;
	}
	
	public void printname() {
		System.out.println(name);
	}

}
