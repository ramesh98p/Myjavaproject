package ThinkQuotient;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int count = 0;
		System.out.println("enter the number");
		int n=sc1.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			count++;	
			}
		}
		if(count==2)
		System.out.println("is Prime Number");
		else
		System.out.println("Not prime Number");
		

	}

}
