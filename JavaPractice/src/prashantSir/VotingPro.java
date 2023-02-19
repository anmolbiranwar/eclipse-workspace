package prashantSir;

import java.util.Scanner;

public class VotingPro {
 
	void Voting()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ");
		int age=17;
		if(age<=18)
		{
			System.out.println("Not eligible for the voting");
		}
		else {
			System.out.println("Eligible for the voting");
		}
	}
	
	public static void main(String[] args) {
		VotingPro obj=new VotingPro();
		obj.Voting();

	}

}
