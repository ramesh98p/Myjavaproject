package PracticeProgram;

import java.util.Scanner;

public class Counteven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
boolean s=true;
while(s) {
System.out.println("Enter the numbe");
int num=sc1.nextInt();
int e=0;
int o=0;
while(num>0)
{
	int rem=num%10;
	if(num%2==0)
	{
		e++;
	}else
	{
		o++;
	}
	num=num/10;
}
System.out.println(e);
System.out.println(o);
	}
s=false;
}
}