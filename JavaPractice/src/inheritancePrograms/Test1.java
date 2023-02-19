package inheritancePrograms;

class A{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int x;
	int y;
	public void show() 
	{
	System.out.println(x+y);	
	}
}

class C extends B
{
	int p;
	int q;
	public void addition()
	{
		System.out.println(a+b+x+y+p+q);
		
	}
	
}

public class Test1 {

	public static void main(String[] args) 
	{
	/*A objA=new A();
	objA.a=100;
	objA.b=200;
	objA.display();
	*/
	B objB=new B();
	objB.x=200;
	objB.y=300;
	objB.show();
	
	objB.a=11;
	objB.b=22;
	objB.display();
	
	C objC=new C();
	objC.a=1;
	objC.b=2;
	objC.x=3;
	objC.y=4;
	objC.p=5;
	objC.q=6;
	objC.addition();
	}

}
