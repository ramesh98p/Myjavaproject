package ThinkQuotient;

import java.util.Scanner;

public class ArmstrongNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
int rem,arm=0,c;
System.out.println("enter the number");
int n=sc1.nextInt();

c=n;
while(n>0) {
	
rem=n%10;
arm=(rem*rem*rem)+arm;
n=n/10;
}
if(c==arm) 
	System.out.println("Armstrong number");
else 
	System.out.println("Not Armstrong number");

}
	}


