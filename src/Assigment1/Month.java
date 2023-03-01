package Assigment1;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
			
		
		System.out.println("1 :Janewary");
		System.out.println("2 :Februwary");
		System.out.println("3 :March");
		System.out.println("4 :April");
		System.out.println("5 :May");
		System.out.println("6 :june");
		System.out.println("7 :July");
		System.out.println("8 :Augst");
		System.out.println("9 :Sep");
		System.out.println("10 octomber");
		System.out.println("11 November");
		System.out.println("12 :December");
		int choice=sc1.nextInt();
		
		
			switch(choice) {
			case 1:
				System.out.println("========================================");
				System.out.println("31 days");
				System.out.println("========================================");
				break;
			case 2:
				System.out.println("========================================");
				
				System.out.println("28 days");
				System.out.println("========================================");
				break;
			case 3:
				System.out.println("========================================");
				System.out.println("31 days");
				System.out.println("========================================");
				break;
				
			case 4:
				System.out.println("========================================");
				System.out.println("30 days");
				System.out.println("========================================");
				break;
			case 5:
				System.out.println("========================================");
				System.out.println("31 days");
				System.out.println("========================================");
				break;
			case 6:
				System.out.println("========================================");
				System.out.println("30 days");
				System.out.println("========================================");
				break;
			case 7:
				System.out.println("========================================");
				System.out.println("31 days");
				System.out.println("========================================");
				break;
			case 8:
				System.out.println("========================================");
				System.out.println("30 days");
				System.out.println("========================================");
				break;
			case 9:
				System.out.println("========================================");
				System.out.println("31 days");
				System.out.println("========================================");
				break;
			case 10:
				System.out.println("========================================");
				System.out.println("30 days");
				System.out.println("========================================");
				break;
			case 11:
				System.out.println("========================================");
				System.out.println("31 days");
				System.out.println("========================================");
				break;
			case 12:
				System.out.println("========================================");
				System.out.println("30 days");
				System.out.println("========================================");
				break;
				default :
					System.out.println("invalid month");
				
			}

	}
status=false;
}
}