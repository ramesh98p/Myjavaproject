package PracticeProgram;

import java.util.Scanner;

public class SumODigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc1.nextInt();
int a=0,b=1,sum=0;
for(int i=2;i<=num;i++)
{
	sum=a+b;
	System.out.println(sum);
	a=b;
	b=sum;
	
	
}
	}

}
