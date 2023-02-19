package javaPrac;

public class ConstructorOverloadinProgram {
	
	int a=0;
	int b=0;
	double c=0;
	ConstructorOverloadinProgram()
	{
		a=10;
		b=20;
		c=20.5;
		
	}
	ConstructorOverloadinProgram(int x, int y)
	{
		a=x;
		b=y;
		
	}
	ConstructorOverloadinProgram(int x, double y)
	{
		a=x;
		c=y;
	}
	ConstructorOverloadinProgram(int x, int y, double z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		/*Constructor: 1-constructor is special kind of method
		 *2-Constructor name should be same as class name.
		 *3-constructor will not return any value
		 *4-constructor will be invoked at the time object creation.(we no need to call the constructor explicitly).
		 *5-constructor will take the parameters(just like a method)
		 *6-constructor is used for initialize the values
		 Constructor name should be same as the class name.
		 1)default constructor -no parameter
		 2)parameterized constructor -with parameter
		 
		 * Constructor Overloading: A class contains more than one constructor is called Constructor Overloading.	
    Rule1: Number of parameters
	Rule2: Order of parameters
	Rule3: Data types of parameters 
		 */
		
		
		
	}

}
