package Task4;

public class Book {
static String bName;
double bPrice;


void aceptDetails(String name,double price)
{
	 bName=name;
	 bPrice=price;
	
}
void display()
{
	
	System.out.println("Display"+bName);
	System.out.println("Display"+bPrice);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b1=new Book();
b1.aceptDetails("marathi", 150);
b1.display();
	
		
	}

}
