package abstracationProgram;

abstract class Animal {
	public abstract void animalSound();

	public void sleep() {
		System.out.println("ZzzZZzz");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says:wee wee");
	}
}

public class Main {

	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();

	}

}
