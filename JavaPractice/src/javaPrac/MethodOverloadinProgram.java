package javaPrac;

public class MethodOverloadinProgram {
	
	int a;
	int b;
	
	void sum() {
		a=10;
		b=20;
		System.out.println(a+b); //First method
	}
	void sum(int a, int b) {
		System.out.println(a+b); //Second method
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c); //Third method
	}
	void sum(int a, double b) {
		System.out.println(a+b);  //Fourth method
	}
	
	public static void main(String[] args) {
		
		/* 
		 *  Method Overloading: A class contains more than one method with 
		 *  the same name is called as method overloading.
		  
	Rule1: Number of parameters
	Rule2: Order of parameters
	Rule3: Data types of parameters
*/
		MethodOverloadinProgram mo=new MethodOverloadinProgram();
		mo.sum(); //call the first method
		mo.sum(20, 30); //call the second method
		mo.sum(10, 20, 30); //call the third method
		mo.sum(10, 10.5); //call the fourth method
		
	
	}

}
