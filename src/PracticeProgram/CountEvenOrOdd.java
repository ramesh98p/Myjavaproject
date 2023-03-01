package PracticeProgram;

import java.util.Scanner;

public class CountEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("enter the number");
int num=sc1.nextInt();
int even=0;
int odd=0;
while(num>0)
{
	int rem=num%10;
	if(rem%2==0) {
		even++;
		
	}else
	{
		odd++;
	}
	num=num/10;
}
System.out.println(even+"even number");
System.out.println(odd+"odd number");
	}

}
