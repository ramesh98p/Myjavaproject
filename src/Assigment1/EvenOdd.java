package Assigment1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("enter the number");
		int number=sc1.nextInt();
		
		switch(number%2) {
		case 0:
			System.out.print(number+"Event Number");
			break;
		case 1:
			System.out.println(number+"odd");
			break;
		}
		

	}
status=false;
}
}