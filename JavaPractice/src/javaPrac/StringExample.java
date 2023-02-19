package javaPrac;

public class StringExample {

	public static void main(String[] args) {

		String s = "Welcome";
		//length()
		System.out.println(s.length());// 7 number of characters in the string
		//charAt()
		System.out.println(s.charAt(5));

		// concat()
		
		String s1 = "Welcome to";
		String s2 = "Training";
		System.out.println(s1 + " " + s2);
		System.out.println(s1.concat(" " + s2));
		System.out.println("Anmol " + "Biranwar");
		System.out.println("Anmol".concat(" Biranwar"));
		System.out.println(s1.concat(" "+s2));

		// equals():Comparing two strings and it returns only true or false

		String s3 = "Welcome";
		String s4 = "Welcome";
		System.out.println(s3.equals(s4)); // false
		System.out.println(s3.equalsIgnoreCase(s4));// true

		// contains()
		System.out.println(s3.contains("Wel"));// true
		System.out.println(s3.contains(s4));

		// substring()
		/*
		 * 0 1 2 3 4 5 6---->Starting index W E L C O M E 1 2 3 4 5 6 7---->Ending index
		 * 
		 * substring(starting index, ending index) s.substring(0,3)---> W E L
		 * s.substring(2,5)---> L C O s.substring(4,7)---> O M E
		 */
 
		System.out.println(s3.substring(0, 3));

		// replace()
		String s5 = "Welcome";
		System.out.println(s.replace("e", "a"));
		System.out.println(s5.replace("come", "Anmol"));
		System.out.println(s5.toLowerCase());
		System.out.println(s5.indexOf(5));
		

	}

}
