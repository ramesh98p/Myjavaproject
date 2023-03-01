package PracticeProgram;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("enter the number");
int num=sc1.nextInt();

int count=0;
if(num>0)
{
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		
			count++;
			
		}
		if(count==2)
		
			System.out.println("prime number");
		else 
			System.out.println("not prime number");
			
		
	}
}
	}


