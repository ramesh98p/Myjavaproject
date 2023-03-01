package PracticeProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
boolean s=true;
while(s) {
System.out.println("enter the number");
int num=sc1.nextInt();
int count=0;
if(num>1) {
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		
			count++;
		}
		if(count==2)
		
			System.out.println("Prime Number");
			else 
				System.out.println("not prime number");
			
		}
	}
s=false;
}
}