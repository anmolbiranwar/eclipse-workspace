package javaPrac;

class A {
	public int i;
	protected int j;

}

class B extends A {
	void display() {
		super.j = super.i + 1;
		System.out.println(super.i + "" + super.j);
	}
}

class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		obj.i = 1;
		obj.j = 2;
		obj.display();
	}

}
