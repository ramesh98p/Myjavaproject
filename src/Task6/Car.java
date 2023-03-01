package Task6;

import java.util.Scanner;

public class Car {
	
	
	private int id;
	private String name;
	private double price;
	private String color;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double gePrice()
	{
		return price;
	}
	public String getColor()
	{
		return color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car();
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the car id");
int carid=sc1.nextInt();
System.out.println("enter the name");
String cname=sc1.next();
c1.setId(101);
c1.setName("bmw");
c1.setPrice(70000);
c1.setColor("red");
	System.out.println(c1.id);	
	System.out.println(c1.name);
//System.out.println(c1.getId()+" "+c1.getName()+" "+c1.gePrice()+" "+c1.getColor());
	}

}
