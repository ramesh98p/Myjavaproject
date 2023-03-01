package ThinkQuotient;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		
	     
		Scanner sc1=new Scanner(System.in);
		int reminder,reverse=0;
		System.out.println("enter the number");
		int n=sc1.nextInt();
		
		while(n!=0) {
			
			int remider=n%10;
			reverse=reverse*10+remider;
			n=n/10;
			
		}
		System.out.println(reverse);
	}

}
