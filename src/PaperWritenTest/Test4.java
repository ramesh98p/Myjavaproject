package PaperWritenTest;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		int num=1;
for(int i=0;i<=size;i++)
{
	
	for(int j=0;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=i;k<=size;k++)
	{
		System.out.print(num++);
	}
	num=1;
	System.out.println();
}
	}

}
