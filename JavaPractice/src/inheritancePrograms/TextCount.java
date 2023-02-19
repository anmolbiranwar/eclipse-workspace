package inheritancePrograms;

public class TextCount {

	public static void main(String[] args) {
		String string = "My name is Anmol. I am from Gondia in Maharashtra.";
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}
		System.out.println("String is :"+string);
		System.out.println("Total number of characters in a string: " + count);
	}

}
