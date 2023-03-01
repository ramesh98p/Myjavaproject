package Task5;

public class Product {
	
	String pname;
	int price;
	int qty;
	
	
	
	public  void acceptDetails(String name,int pric,int qy)
	{
		pname=name;
		price=pric;
		qty=qy;
		
	}
	
	public void display()
	{
		System.out.println(pname);
		System.out.println(price);
		System.out.println(qty);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p1=new Product();
p1.acceptDetails("laptop", 250, 2);
p1.display();
	}

}
