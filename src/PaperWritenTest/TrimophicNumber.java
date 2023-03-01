package PaperWritenTest;

import java.util.Scanner;

public class TrimophicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
boolean status=true;
while(status) {
	

System.out.println("enter the number");
int n=sc1.nextInt();
int d,c=0,cube;

cube=n*n*n;
int temp=n;
	while(temp>0)
	{
		c++;
		temp=temp/10;
	}
	
	int end=(int)(cube%(Math.pow(10,c)));
	if(n==end)
		System.out.println(n+"trimophonic number");
	else
	
		System.out.println("not trimophonic");
	
}
status=false;
	}

}
