package Task4;

public class Car1 {
	 int cmodelno;
	double cprice;
	String ccolor;
	String cname;
	
	
	 void accesCarDetails (int model,double price,String color,String name) {
		cmodelno=model;
		cprice=price;
		ccolor=color;
		cname=name;
		
		
	}
	void showDetails()
	{
		
		System.out.println(cmodelno);
		
		System.out.println(cprice);
		
		System.out.println(ccolor);
		
		System.out.println(cname);
	}

public static void main(String[] args)
{
	Car1 c1=new Car1();
	c1.accesCarDetails(101,90000,"white","briza");
	c1.showDetails();
	c1.accesCarDetails(102,150000,"read","thar");
	c1.showDetails();
	c1.accesCarDetails(103,700000,"white","blero");
	c1.showDetails();
	
}
}
