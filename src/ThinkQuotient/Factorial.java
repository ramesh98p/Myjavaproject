package ThinkQuotient;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("enter the number");
int number=sc1.nextInt();
int fact=1;
for(int i=1;i<=number;i++)
{
	fact=fact*i;
	
	System.out.println(fact);
}
	}

}
