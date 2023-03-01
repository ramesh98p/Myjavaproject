package Constructor;

import java.util.Scanner;

public class Laptop {
      int ram;
     String name;
     double price;
	
	public Laptop(int ram,String name,double price) {
		this.ram=ram;
		
		this.name=name;
		this.price=price;
		
	}
	void display()
	{
		
		System.out.println(ram+" "+name+" "+price);
	}

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Laptop l1=new Laptop();
		
		
		System.out.println("enter the laptop ram");
		int l=sc1.nextInt();
		System.out.println("enter the name");
		String l2=sc1.next();
		System.out.println("enter the price");
		double l3=sc1.nextDouble();
		
		l1.display();//
		
		
	}


}
