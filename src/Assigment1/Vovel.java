package Assigment1;

import java.util.Scanner;

public class Vovel {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("enter the character");
		char charcter=sc1.next().charAt(0);
		
		switch(charcter) {
		case 'a':
		case 'i':
		case 'o':
		case 'e':
		case 'u':
			System.out.println("Vovel");
			break;
			default :
				System.out.println("Consont");
		}

	}
status=false;
}
}