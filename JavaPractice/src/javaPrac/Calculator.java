package javaPrac;

public class Calculator {
	static void add(int i, int j)
	{
		System.out.println(i+j);
	}
	static void sub(int i,int j)
	{
		System.out.println(i-j);
	}
	static void mul(int i, int j)
	{
		System.out.println(i*j);
	}
	static void div(int i, int j)
	{
		System.out.println(i/j);
	}

	public static void main(String[] args) 
	{
		add(10,20);
		sub(20,10);
		mul(2,5);
		div(5,10);
		 
	}

}
