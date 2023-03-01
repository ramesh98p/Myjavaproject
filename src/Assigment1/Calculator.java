package Assigment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		
		
		System.out.println("enter first number");
		int a=sc1.nextInt();
		System.out.println("enter the second number");
		int b=sc1.nextInt();
		
		System.out.println("1 :Addition");
		System.out.println("2 :Multiplication");
		System.out.println("3 :Dividation");
		System.out.println("4 :Substraction");
		int choice=sc1.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a*b);
			break;
		case 3:
			System.out.println(a/b);
			break;
		case 4:
			System.out.println(a-b);
			break;
		}

	}
status=false;
}
}
