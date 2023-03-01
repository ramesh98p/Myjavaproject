package PracticeProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
boolean s=true;
while(s) {
System.out.println("enter the number");
int num=sc1.nextInt();

int rev=0;
int org=num;
while(num!=0) {
	rev=rev*10+num%10;
	num=num/10;
}
	if(org==rev)
	
		System.out.println(org+"Palindrome");
	
		else 
			System.out.println(org+"not palindrome");
	
}
s=false;
	}
}

