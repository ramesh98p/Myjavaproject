package Assigment1;

import java.util.Scanner;

public class MonthProgram {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("Enter the Monthe 1==Jan and 12==December");
		int month=sc1.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("31 day in this month");
			
		}else if(month==2) {
			System.out.println("28 days in this month");
		}else if(month==4||month==6||month==9||month==11) {
			System.out.println("30 days in this month");
		}
		else {
			System.out.println("Invalid month");
		}
	}
status=false;
}
}