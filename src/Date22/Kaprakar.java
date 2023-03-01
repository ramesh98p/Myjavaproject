package Date22;

import java.util.Scanner;

public class Kaprakar {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int temp,sum=0,sqr,c=1,a=0,b=0;
		boolean status=true;
		while(status) {
		System.out.println("enter the number");
		int num=sc1.nextInt();
		
		sqr=num*num;
		temp=num;
		while(num!=0) {
			c=c*10;
			num=num/10;
		
		}
		a=sqr%c;
		b=sqr/c;
		sum=a+b;
		if(num==num)
		
			System.out.println("Kaprekar number");
		else 
			System.out.println("Not Kaprekar");
		

	}
status=false;
}
}
