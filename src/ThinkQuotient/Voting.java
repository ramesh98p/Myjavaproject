package ThinkQuotient;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("enter the voter id");
		int vid=sc1.nextInt();
		System.out.println("enter your age");
		double age=sc1.nextDouble();
		if(vid==2211 || vid==3333)
		{
			if(age>18) {
				System.out.println("Eligble Voting");
			}
			else {
				System.out.println(" age is not Eligble");
			}
			
		}
		else {
		System.out.println("Not Match Voter id");

	}
		}	
status=false;
}
}