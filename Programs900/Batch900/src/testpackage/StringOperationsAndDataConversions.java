package testpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringOperationsAndDataConversions {

	public static void main(String[] args) {

		String value = "  ( Username : Lakshmi | Password : admin123 )  ";

		// Number of chars with in String
		int totalChars = value.length();
		System.out.println("Total Char's : " + totalChars);

		// To get specific char by providing index
		char letter = value.charAt(10);
		System.out.println("Char @ Index 10 : " + letter);

		// to remove unwanted beginning and trailing spaces
		String trimmedText = value.trim();
		System.out.println("Trimmed Text :" + trimmedText);

		// Get part of the text from the String
		String username1 = trimmedText.substring(13);
		String username2 = trimmedText.substring(13, 18);
		System.out.println(username1);
		System.out.println(username2);

		// Get Username from the String
		String[] values = trimmedText.split(" ");
		System.out.println("Username is: " + values[3]);

		// Join multiple Strings
		String newValue = value.concat(" || Role : QA ) ");
		System.out.println(newValue);

		// Change the case of all chars with in the String
		String lowercaseValue = value.toLowerCase();
		String uppercaseValue = value.toUpperCase();
		System.out.println(lowercaseValue);
		System.out.println(uppercaseValue);

		// To compare two different strings
		String user1 = "Abc";
		String user2 = "ABC";
		String user3 = "Abc";

		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));

		System.out.println(user1.equalsIgnoreCase(user2));
		System.out.println(user1.equalsIgnoreCase(user3));

		System.out.println(user1.contains("AB"));
		System.out.println(user1.contains("Ab"));

		System.out.println(value);

		// =========================================================================/
		StringBuilder sb = new StringBuilder(value);
		System.out.println(sb);
		sb.append("|| Role : QA ");
		System.out.println(sb);
		
		// =========================================================================/
		
		//String to Integer (Integer.valueOf(String)) || (Integer.pharseint(string)) 
		String num = "123";
		int number1 = Integer.valueOf(num);
		int number2 = Integer.parseInt(num);
		int output = number2*100;
		System.out.println(output);
		
		// Number to text
		String text = String.valueOf(output);
		System.out.println(text+100);
		
		// generate random uniqueid
		SimpleDateFormat s = new SimpleDateFormat("MMddyyhhmmss");
		String uniqueid = s.format(Calendar.getInstance().getTime());
		System.out.println(uniqueid);
		
		//Type Casting
		double lat = 12.47267546;
		int val = (int)lat;
		System.out.println(val);
		double newVal = (double) val;
		System.out.println(newVal);
		
	}

}
