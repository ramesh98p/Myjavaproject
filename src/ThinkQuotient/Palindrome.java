package ThinkQuotient;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r,s = 0,c;
      Scanner sc1=new Scanner(System.in);
System.out.println("enter the number");
int palin=sc1.nextInt();
c=palin;
while(palin>0) {
	r=palin%10;
	s=(s*10)+r;
	palin=palin/10;
	
}
	if(c==s)
		System.out.println("Palindrome");
	
	else
		System.out.println("not Palindrome");	
		}

}
