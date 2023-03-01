package ThinkQuotient;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
			
		
		System.out.println("enter the number");
		int num=sc1.nextInt();
		
		if(num>0)
		{
			System.out.println("number is positive");
			
		}else {
			System.out.println("number is negative");
		}
	}
status=false;
}
}