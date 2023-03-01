package Task5;

public class Factor {
	
	
	
	
	
public void fact(int f)
{
	
	
	for(int i=1;i<=f;i++)
	{
		if(f%i==0)
		{
			System.out.println(i);
		}
	}
}

	public static void main(String[] args) {
		
    Factor f1=new Factor();

    f1.fact(6);
	}

}
