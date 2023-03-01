package PracticeProgram;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		boolean s=true;
		while(s) {
		System.out.println("enter the numebr");
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
s=false;
}
}