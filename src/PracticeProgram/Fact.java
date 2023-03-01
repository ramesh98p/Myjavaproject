package PracticeProgram;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc1.nextInt();
int fact=1;
for(int i=1;i<=num;i++)
{
	fact=fact*i;
	
}
System.out.println(fact);
	}

}
