package ThinkQuotient;

import java.util.Scanner;

public class MaxNumber {
	
	public static void main(String[] args)
	{
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the number");
		int n1=sc1.nextInt();
		System.out.println("enter the second number");
		int n2=sc1.nextInt();
		System.out.println("enter the third number");
		int n3=sc1.nextInt();
		System.out.println("enter the forth number");
		int n4=sc1.nextInt();
		
		if(n1>n2&& n1>n3&& n1>n4)
		{
			System.out.println("Is the greater number"+n1);
			
		}else if(n2>n3&&n2>n4) {
			System.out.println(n2+"is greater than");
		}
		else if(n3>n4) {
			System.out.println(n3+"is greater number");
		}
		else {
			System.out.println(n4+"is Greater number");
		}
	}

}
