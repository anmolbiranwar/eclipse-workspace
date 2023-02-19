package inheritancePrograms;
	
class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class BabyDog1 extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
}
class BabyDog2 extends Dog
{
	void cry()
	{
		System.out.println("Crying");
	}
}


public class HybridInheritance {

	public static void main(String[] args) {
BabyDog2 b=new BabyDog2();
b.bark();
b.cry();
b.eat();

	}

}
