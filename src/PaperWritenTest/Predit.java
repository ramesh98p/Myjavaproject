package PaperWritenTest;

public class Predit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 5; i > 0;i-- ){
			int mysteryInt = 100;
			mysteryInt -= i;
		System.out.println(mysteryInt);
		}

	}

}
*/
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				if(j==2)
				{
				   break;
				   System.out.println(j);
				}
				j++;
			}
			System.out.println(i);
		}
}
}