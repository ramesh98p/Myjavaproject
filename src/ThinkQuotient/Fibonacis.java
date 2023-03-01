package ThinkQuotient;
import java.util.Scanner;
public class Fibonacis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the term");
		int term=sc1.nextInt();
		for(int i=1;i<=term;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

	}


