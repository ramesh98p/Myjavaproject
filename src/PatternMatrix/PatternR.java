package PatternMatrix;

public class PatternR {

	public static void main(String[] args) {
		
		
		for(char i='A';i<='G';i++)
		{
			for(char j='A';j<='E';j++)
			{
				if(i=='A'||j=='E'||i=='A'||j=='E') {
					
					System.out.print("*");
				}
				System.out.print(" ");
				
			}
			
			System.out.println();
		}
	}

}
