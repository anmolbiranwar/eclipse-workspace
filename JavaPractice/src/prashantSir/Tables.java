package prashantSir;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=s.nextInt();
		for(int i=1; i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
