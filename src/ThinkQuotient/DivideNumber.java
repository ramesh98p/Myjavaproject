package ThinkQuotient;

import java.util.Scanner;

public class DivideNumber {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("enter the number");
		int num=sc1.nextInt();
		if(num%3==0&& num%9==0)
		{
			System.out.println("Confirm");
		}else
		{
			System.out.println("not ");
		}

	}
status=false;
}
}