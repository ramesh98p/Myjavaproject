package PracticeProgram;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("enter the numeber");
int num=sc1.nextInt();
int sum=0;
while(num>0)
{
	sum=sum+num%10;
	num=num/10;
	
}
System.out.println(sum);
	}

}
