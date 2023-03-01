package PracticeProgram;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
boolean s=true;
while(s) {
System.out.println("enter the numebr");
int num=sc1.nextInt();
int count=0;
while(num>0) {
	num=num/10;
	count++;
}
System.out.println(count);
	}
s=false;
}
}